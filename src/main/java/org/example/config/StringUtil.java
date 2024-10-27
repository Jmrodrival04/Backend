package org.example.config;

public class StringUtil {

    // Verifica si una cadena es nula o está vacía
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Capitaliza la primera letra de una cadena
    public static String capitalizeFirstLetter(String str) {
        if (isNullOrEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
