package org.example.controller;

import org.example.model.Spell;
import org.example.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpellManagementController {

    private final SpellService spellService;

    @Autowired
    public SpellManagementController(SpellService spellService) {
        this.spellService = spellService;
    }

    @GetMapping("/spells")
    public List<Spell> getAllSpells() {
        return spellService.getAllSpells();
    }

    @PostMapping("/spells")
    public Spell addSpell(@RequestBody Spell spell) {
        return spellService.addSpell(spell);
    }
}
