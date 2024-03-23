package com.mylibsys.libsystem.utils;

    import org.hashids.Hashids;

import java.time.LocalDateTime;
import java.util.Random;

public class DateTimeRanDomID {

    private static final int MIN_LENGTH = 8; // Độ dài tối thiểu của mã ngẫu nhiên
    private Hashids hashids;
    private static final int SALT_LENGTH = 16;

    public DateTimeRanDomID() {
        this.hashids = new Hashids(generateSalt(), MIN_LENGTH);
    }

    public static String generateSalt() {
        StringBuilder salt = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < SALT_LENGTH; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            System.out.println(randomChar);
            if (random.nextBoolean()) {
                randomChar = Character.toUpperCase(randomChar);
            }
            salt.append(randomChar);
        }
        System.out.println("chuỗi ngẫu nhiên 5 kí tự" + salt.toString());
        return salt.toString();
    }

    public long  getRanDomID() {
        LocalDateTime now = LocalDateTime.now(); 
        int day = now.getDayOfMonth();
        System.out.println(day);
        int month = now.getMonthValue();//
        System.out.println(month);
        int year = now.getYear();//2023
        System.out.println(year);
        int hour = now.getHour();//6
        System.out.println(year +"y");
        int minute = now.getMinute();//6
        System.out.println("minutes"+minute);
        int second = now.getSecond();//6 12 6 , 5 11 8
        System.out.println("second :"+second);
        String totalString=String.valueOf(String.valueOf(now.getYear())+String.valueOf(now.getMonthValue())+now.getDayOfMonth())+String.valueOf(now.getHour())+String.valueOf(now.getMinute())+String.valueOf(now.getSecond());
try {
    long totalMinutes = Long.parseLong(totalString);
    System.out.println("số ngẫu nhiên là : " + totalMinutes);

    return  totalMinutes;
    // Use the 'number' variable as needed. 
} catch (NumberFormatException e) {
    // Handle the exception (e.g., log the error, show an error message, etc.).
}       
//        return null;
    return 0;
    }

    public String generateUniqueRandomCode() {
        long totalMinutes = getRanDomID();
        return hashids.encode(totalMinutes);
    }

    public static void main(String[] args) {
        DateTimeRanDomID dt = new DateTimeRanDomID();// ng?u nhiên là : 202381215052
        System.out.println("ma nn la :"+dt.generateUniqueRandomCode());
    }
}
