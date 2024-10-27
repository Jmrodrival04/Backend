package org.example.controller;

import org.example.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuditPageController {

    private final AuditService auditService;

    @Autowired
    public AuditPageController(AuditService auditService) {
        this.auditService = auditService;
    }

    @GetMapping("/audit")
    public String auditLogPage(Model model) {
        model.addAttribute("auditLogs", auditService.getAuditLogs());
        return "audit";  // Apunta a un archivo audit.html en templates
    }
}
