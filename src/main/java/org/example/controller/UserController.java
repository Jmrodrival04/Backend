package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Método para obtener la lista de usuarios y mostrar la página de usuarios
    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users"; // Nombre del archivo HTML (users.html)
    }

    // Método para agregar un nuevo usuario y redirigir a la lista de usuarios
    @PostMapping("/users/add")
    public String addUser(@RequestParam String username, @RequestParam String role) {
        userService.addUser(new User(username, role));
        return "redirect:/users"; // Redirige a la página de usuarios después de agregar
    }
}
