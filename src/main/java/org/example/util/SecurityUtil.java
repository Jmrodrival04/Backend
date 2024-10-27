package org.example.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityUtil {

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Encripta una contraseña
    public static String encryptPassword(String password) {
        return passwordEncoder.encode(password);
    }

    // Verifica una contraseña sin encriptar con la encriptada
    public static boolean checkPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
