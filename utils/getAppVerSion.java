/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;



/**
 *
 * @author kuteb
 */
public class getAppVerSion {
public static String getAppVersion() {
    File pomFile = new File("pom.xml");
    MavenXpp3Reader reader = new MavenXpp3Reader();
    Model model;
    try (FileInputStream inputStream = new FileInputStream(pomFile)) {
        model = reader.read(inputStream);
        return model.getVersion();
    } catch (IOException | XmlPullParserException e) {
    }
    return null;
} 

}
