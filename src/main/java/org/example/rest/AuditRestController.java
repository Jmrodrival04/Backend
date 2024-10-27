package org.example.rest;

import org.example.model.AuditLog;
import org.example.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audit")
public class AuditRestController {

    private final AuditService auditService;

    @Autowired
    public AuditRestController(AuditService auditService) {
        this.auditService = auditService;
    }

    @GetMapping
    public List<AuditLog> getAllAuditLogs() {
        return auditService.getAuditLogs();
    }

    @PostMapping
    public AuditLog addAuditLog(@RequestBody AuditLog auditLog) {
        return auditService.addAuditLog(auditLog);
    }
}
