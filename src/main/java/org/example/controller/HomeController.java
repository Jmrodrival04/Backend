package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("welcomeMessage", "Bienvenido al Sistema de Gestión Mágica");
        return "home";  // Apunta a un archivo home.html en templates
    }
}
