package org.example.service;

import org.example.model.AuditLog;
import org.example.repos.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuditService {

    private final AuditLogRepository auditLogRepository;

    @Autowired
    public AuditService(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    public List<AuditLog> getAuditLogs() {
        return auditLogRepository.findAll();
    }

    public AuditLog addAuditLog(String action, String performedBy) {
        AuditLog auditLog = new AuditLog(action, performedBy, LocalDateTime.now());
        return auditLogRepository.save(auditLog);
    }
}
