package org.example.repos;

import org.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Método personalizado para buscar un usuario por nombre de usuario
    User findByUsername(String username);
}
