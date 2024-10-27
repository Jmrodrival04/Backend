package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String action;
    private String performedBy;
    private LocalDateTime timestamp;

    public AuditLog() {}

    public AuditLog(String action, String performedBy, LocalDateTime timestamp) {
        this.action = action;
        this.performedBy = performedBy;
        this.timestamp = timestamp;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getAction() {
        return action;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
