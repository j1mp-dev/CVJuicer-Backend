package com.api.cvjuicer.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="TB_CV_MODEL")
public class CvModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @Column(nullable = false)
    String content;

    @Column(nullable = false)
    LocalDateTime createdAt;

    @Column(nullable = false)
    boolean visible;

    public CvModel() {
    }

    public CvModel(UUID id, String content, LocalDateTime createdAt, boolean visible) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.visible = visible;
    }

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "CvModel{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", visible=" + visible +
                '}';
    }
}
