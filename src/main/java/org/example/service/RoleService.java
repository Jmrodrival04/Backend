package org.example.service;

import org.example.model.Role;
import org.example.repos.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    public Role findRoleByName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }
}
