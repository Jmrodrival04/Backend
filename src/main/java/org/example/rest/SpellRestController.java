package org.example.rest;

import org.example.model.Spell;
import org.example.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/spells")
public class SpellRestController {

    private final SpellService spellService;

    @Autowired
    public SpellRestController(SpellService spellService) {
        this.spellService = spellService;
    }

    @GetMapping
    public List<Spell> getAllSpells() {
        return spellService.getAllSpells();
    }

    @PostMapping
    public Spell addSpell(@RequestBody Spell spell) {
        return spellService.addSpell(spell);
    }

    @DeleteMapping("/{id}")
    public void deleteSpell(@PathVariable Long id) {
        spellService.deleteSpell(id);
    }
}
