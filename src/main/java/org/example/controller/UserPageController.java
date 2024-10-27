package org.example.controller;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserPageController {

    private final UserService userService;

    @Autowired
    public UserPageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String userManagementPage(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("newUser", new User());
        return "users";  // Apunta a un archivo users.html en templates
    }

    @PostMapping("/users/add")
    public String addUser(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/users";  // Redirige a la página de gestión de usuarios después de agregar
    }
}
