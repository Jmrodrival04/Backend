package org.example.controller;

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

    @GetMapping("/audit")
    public String auditLog(Model model) {
        model.addAttribute("auditLogs", auditService.getAuditLogs());
        return "audit-log"; // Apunta al archivo audit-log.html en templates
    }
}
