package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String appName() {
        return "Sistema de Gestión Mágica";
    }

    @Bean
    public int maxSpellCount() {
        return 100; // Ejemplo de configuración que limita el número de hechizos
    }
}
