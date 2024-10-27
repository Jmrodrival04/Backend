package org.example.controller;

import org.example.model.Spell;
import org.example.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpellPageController {

    private final SpellService spellService;

    @Autowired
    public SpellPageController(SpellService spellService) {
        this.spellService = spellService;
    }

    @GetMapping("/spells")
    public String spellManagementPage(Model model) {
        model.addAttribute("spells", spellService.getAllSpells());
        model.addAttribute("newSpell", new Spell());
        return "spells";  // Apunta a un archivo spells.html en templates
    }

    @PostMapping("/spells/add")
    public String addSpell(@ModelAttribute Spell spell) {
        spellService.addSpell(spell);
        return "redirect:/spells";  // Redirige a la página de gestión de hechizos después de agregar
    }
}
