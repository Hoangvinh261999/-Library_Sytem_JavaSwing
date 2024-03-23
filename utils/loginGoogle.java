/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.utils;

import com.google.gson.Gson;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

/**
 *
 * @author kuteb
 */
public class loginGoogle {

    public static String gmail;
    private static final String clientId = "95421074806-5vvmigr123i3bqsdiue1ahmp1jepj9s8.apps.googleusercontent.com";
    private static final String cls = "************************";//cl
    private static final String authorizationEndpoint = "https://accounts.google.com/o/oauth2/auth";
    private static final String tokenEndpoint = "https://oauth2.googleapis.com/token";
    private static final String userInfoEndpoint = "https://www.googleapis.com/oauth2/v3/userinfo";

    public void performOAuthLogin() throws IOException, Exception {

        int port = getFreePort();
        String redirectURI = String.format("http://%s:%d/", "127.0.0.1", port);
        output("redirect URI: " + redirectURI);

        String authorizationRequest = String.format("%s?response_type=code&scope=openid%%20profile%%20email&redirect_uri=%s&client_id=%s",
                authorizationEndpoint,
                redirectURI,
                clientId);

        openBrowser(authorizationRequest);

        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();///wating until redirect uri is called (Listens for a connection to be made to this socket and accepts it. The method blocks until a connection is made.)
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String inputLine;
        StringBuilder requestBuilder = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            requestBuilder.append(inputLine).append("\n");
            if (inputLine.isEmpty()) {
                break;
            }
        }
        socket.close();
        serverSocket.close();

        String authorizationResponse = requestBuilder.toString();
        if (authorizationResponse.contains("error=")) {
            output("OAuth authorization error: " + authorizationResponse);
            return;
        }
        if (!authorizationResponse.contains("code=")) {
            output("Malformed authorization response. " + authorizationResponse);
            return;
        }

        String code = extractValueFromQuery(authorizationResponse, "code");
        output("Authorization code: " + code);
        performCodeExchange(code, redirectURI);

    }

private int getFreePort() throws IOException {
    try (ServerSocket socket = new ServerSocket(0)) {
        socket.setReuseAddress(true);
        return socket.getLocalPort();
    }
}


    private void performCodeExchange(String code, String redirectURI) throws IOException{
        output("Exchanging code for tokens...");

        
            OkHttpClient httpClient = new OkHttpClient();
            MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
            String tokenRequestBody = String.format("code=%s&redirect_uri=%s&client_id=%s&client_secret=%s&grant_type=authorization_code",
                    code,
                    redirectURI,
                    clientId,
                    clientSecret);

            RequestBody requestBody = RequestBody.create(mediaType, tokenRequestBody);
            Request request = new Request.Builder()
                    .url(tokenEndpoint)
                    .post(requestBody)
                    .build();

            try ( Response response = httpClient.newCall(request).execute()) {
                String responseBody = response.body().string();
                output(responseBody);

                Gson gson = new Gson();
                TokenEndpointResponse tokenEndpointResponse = gson.fromJson(responseBody, TokenEndpointResponse.class);
                String accessToken = tokenEndpointResponse.getAccessToken();

                userinfoCall(accessToken);
            }
    
    }

    private void userinfoCall(String accessToken) throws IOException{
        output("Making API Call to Userinfo...");

       
            OkHttpClient httpClient = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(userInfoEndpoint)
                    .addHeader("Authorization", "Bearer " + accessToken)
                    .build();

            try ( Response response = httpClient.newCall(request).execute()) {
                String responseBody = response.body().string();

                // Parse the JSON response to extract the email (Gmail)
                JSONObject jsonObject = new JSONObject(responseBody);
                String email = jsonObject.getString("email");

                output("Gmail: " + email);
                gmail = email;
                openGmailPage();
            }
 
//    System.exit(0);
    }

    public void output(String output) {
//        outputTextArea.append(output + "\n");
        System.out.println(output);

    }

    private String extractValueFromQuery(String query, String parameterName) throws Exception{
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            String[] parts = pair.split("=");
            if (parts.length == 2 && parts[0].contains(parameterName)) {
                return parts[1];
            }
        }
        return null;
    }

    private void openBrowser(String url) {
        try {
            Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class TokenEndpointResponse {

        private String access_token;

        public String getAccessToken() {
            return access_token;

        }

    }

// ... (Các phương thức và khai báo khác ở đây)
    private void openGmailPage() {
        try {
            Desktop.getDesktop().browse(new URI("https://mail.google.com/"));
            // Hoặc để chuyển hướng đến gmail.com:
            // Desktop.getDesktop().browse(new URI("https://www.gmail.com/"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
