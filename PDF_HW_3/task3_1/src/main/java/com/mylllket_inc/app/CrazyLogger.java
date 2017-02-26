package com.mylllket_inc.app;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CrazyLogger {
    private StringBuilder log;
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY:hh-mm");

    public void addEvent(String message) {
        if (log == null)
            log = new StringBuilder();
        log.append(LocalDateTime.now().format(format) + " - ");
        log.append(message + "\n");
    }

    public String searchByDate(String toSearch) {
        if (!checkOnFormat(toSearch))
            return null;
        StringBuilder toReturn = new StringBuilder();
        String[] result = log.toString().split("\\n");
        for (int i = 0; i < result.length; i++) {
            if (result[i].substring(0, 16).equals(toSearch))
                toReturn.append(result[i] + "\n");
        }
        if (toReturn.toString().equals(""))
            return toReturn.append("Nothing").toString();
        return toReturn.toString();
    }

    public String searchByMessage(String toSearch) {
        StringBuilder toReturn = new StringBuilder();
        String[] result = log.toString().split("\\n");
        for (int i = 0; i < result.length; i++) {
            if (result[i].substring(19, result[i].length()).equals(toSearch))
                toReturn.append(result[i] + "\n");
        }
        if (toReturn.toString().equals(""))
            return toReturn.append("Nothing").toString();
        return toReturn.toString();
    }

    public String getInfo() {
        return log.toString();
    }

    private boolean checkOnFormat(String data) {
        try {
            format.parse(data);
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Wrong date format!");
            return false;
        }
    }
}
