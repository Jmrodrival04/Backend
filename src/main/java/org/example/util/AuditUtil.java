package org.example.util;

import org.example.model.AuditLog;
import org.example.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuditUtil {

    private static AuditService auditService;

    @Autowired
    public AuditUtil(AuditService auditService) {
        AuditUtil.auditService = auditService;
    }

    // Método para crear un log de auditoría
    public static void logEvent(String action, String performedBy) {
        AuditLog auditLog = new AuditLog(action, performedBy);
        auditService.addAuditLog(auditLog);
    }
}
