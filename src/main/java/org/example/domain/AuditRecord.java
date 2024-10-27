package org.example.domain;

import java.time.LocalDateTime;

public class AuditRecord {

    private String action;
    private String performedBy;
    private LocalDateTime timestamp;

    public AuditRecord(String action, String performedBy) {
        this.action = action;
        this.performedBy = performedBy;
        this.timestamp = LocalDateTime.now();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "AuditRecord{" +
                "action='" + action + '\'' +
                ", performedBy='" + performedBy + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
