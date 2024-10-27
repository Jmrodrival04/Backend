package org.example.repos;

import org.example.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
    // Métodos personalizados, si es necesario, como búsqueda por fecha o usuario
}
