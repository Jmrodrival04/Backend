package org.example.repos;

import org.example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Método personalizado para buscar un rol por nombre
    Role findByRoleName(String roleName);
}
