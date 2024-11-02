package org.example.controller;

import org.example.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpellManagementController {

    private final SpellService spellService;

    @Autowired
    public SpellManagementController(SpellService spellService) {
        this.spellService = spellService;
    }

    @GetMapping("/spells")
    public String spellManagement(Model model) {
        model.addAttribute("spells", spellService.getAllSpells());
        return "spell-management"; // Apunta al archivo spell-management.html en templates
    }
}
