package org.example.service;

import org.example.model.Spell;
import org.example.repos.SpellRepository;
import org.example.util.Auditable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpellService {

    private final SpellRepository spellRepository;

    @Autowired
    public SpellService(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    public List<Spell> getAllSpells() {
        return spellRepository.findAll();
    }

    @Auditable("Agregar nuevo hechizo")
    public Spell addSpell(Spell spell) {
        return spellRepository.save(spell);
    }

    @Auditable("Eliminar hechizo")
    public void deleteSpell(Long id) {
        spellRepository.deleteById(id);
    }
}
