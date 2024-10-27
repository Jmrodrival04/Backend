package org.example.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Formatea la fecha en una cadena legible
    public static String formatDate(LocalDateTime date) {
        return date.format(formatter);
    }

    // Convierte una cadena en formato de fecha a LocalDateTime
    public static LocalDateTime parseDate(String date) {
        return LocalDateTime.parse(date, formatter);
    }
}
