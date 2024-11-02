package org.example.controller;

import org.example.model.AuditLog;
import org.example.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuditLogController {

    private final AuditService auditService;

    @Autowired
    public AuditLogController(AuditService auditService) {
        this.auditService = auditService;
    }

    // Método para obtener los registros de auditoría y mostrar la página de auditoría
    @GetMapping("/audit")
    public String getAuditLogs(Model model) {
        model.addAttribute("auditLogs", auditService.getAuditLogs());
        return "audit-log"; // Nombre del archivo HTML (audit-log.html)
    }
}
