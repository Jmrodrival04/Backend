package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/public/**").permitAll()  // Rutas públicas
                        .requestMatchers("/api/admin/**").hasRole("ADMIN")  // Solo accesible para ADMIN
                        .anyRequest().authenticated()  // El resto de rutas requieren autenticación
                )
                .httpBasic(); // Usa una implementación segura de httpBasic
        return http.build();
    }
}
