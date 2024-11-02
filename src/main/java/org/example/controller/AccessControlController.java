package org.example.controller;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccessControlController {

    private final UserService userService;

    @Autowired
    public AccessControlController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String accessControl(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "access-control"; // Apunta al archivo access-control.html en templates
    }
}
