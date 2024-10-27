package org.example.domain;

import java.time.LocalDateTime;

public class MagicEvent {

    private String description;
    private LocalDateTime timestamp;

    public MagicEvent(String description) {
        this.description = description;
        this.timestamp = LocalDateTime.now();
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "MagicEvent{" +
                "description='" + description + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
