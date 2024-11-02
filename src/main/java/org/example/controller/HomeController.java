package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Método para mostrar la página de inicio
    @GetMapping("/")
    public String home() {
        return "home"; // Nombre del archivo HTML (home.html)
    }
}
