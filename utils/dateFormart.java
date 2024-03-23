/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mylibsys.libsystem.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author kuteb
 */
public class dateFormart {

    public static String formatDate(String s) throws ParseException {
        try {
        DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat targetFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = originalFormat.parse(s);
        String formattedDate = targetFormat.format(date);
        return formattedDate;
        } catch (Exception e) {
        }
        return null;
    }

    public static String formatDateSQL(String s) throws ParseException {
        DateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = originalFormat.parse(s);
        String formattedDate = targetFormat.format(date);
        return formattedDate;
    }

public static String parseDateLSX(LocalDate selectedDate) {
    String formattedDate = null;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    try {
        formattedDate = selectedDate.format(formatter);
    } catch (Exception e) {
    }
    return formattedDate;
}

}
