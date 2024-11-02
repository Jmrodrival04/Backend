package org.example.controller;

import org.example.model.Spell;
import org.example.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SpellController {

    private final SpellService spellService;

    @Autowired
    public SpellController(SpellService spellService) {
        this.spellService = spellService;
    }

    // Método para obtener la lista de hechizos y mostrar la página de hechizos
    @GetMapping("/spells")
    public String getSpells(Model model) {
        model.addAttribute("spells", spellService.getAllSpells());
        return "spells"; // Nombre del archivo HTML (spells.html)
    }

    // Método para agregar un nuevo hechizo y redirigir a la lista de hechizos
    @PostMapping("/spells/add")
    public String addSpell(@RequestParam String name, @RequestParam String type, @RequestParam String effect) {
        spellService.addSpell(new Spell(name, type, effect));
        return "redirect:/spells"; // Redirige a la página de hechizos después de agregar
    }

    // Método para eliminar un hechizo por ID y redirigir a la lista de hechizos
    @PostMapping("/spells/delete/{id}")
    public String deleteSpell(@PathVariable Long id) {
        spellService.deleteSpell(id);
        return "redirect:/spells"; // Redirige a la página de hechizos después de eliminar
    }
}
