package com.mylllket_inc.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {
    private StringBuilder log;
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-YYYY:hh-mm");

    public void addEvent(String message) {
        if (log == null)
            log = new StringBuilder();
        log.append(LocalDateTime.now().format(format) + " - ");
        log.append(message + "\n");
    }

    public String getInfo() {
        return log.toString();
    }
}
