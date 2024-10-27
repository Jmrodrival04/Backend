package org.example.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.example.service.AuditService;
import org.example.util.Auditable;

@Aspect
@Configuration
public class AuditConfig {

    private final AuditService auditService;

    @Autowired
    public AuditConfig(AuditService auditService) {
        this.auditService = auditService;
    }

    // Intercepta cualquier método anotado con @Auditable
    @AfterReturning("@annotation(auditable)")
    public void auditMethod(JoinPoint joinPoint, Auditable auditable) {
        String methodName = joinPoint.getSignature().getName();
        String actionDescription = auditable.value().isEmpty() ? methodName : auditable.value();
        String performedBy = "Sistema"; // Esto puede ser modificado para capturar el usuario actual

        auditService.addAuditLog(actionDescription, performedBy);
    }
}
