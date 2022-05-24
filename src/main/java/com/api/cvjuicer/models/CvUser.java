package com.api.cvjuicer.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="TB_USER_CV")
public class CvUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private UUID userId;

    @Column(nullable = false)
    private UUID modelId;

    @Column(nullable = false)
    private String content;

    public CvUser() {
    }

    public CvUser(UUID id, UUID userId, UUID modelId, String content) {
        this.id = id;
        this.userId = userId;
        this.modelId = modelId;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getModelId() {
        return modelId;
    }

    public String getContent() {
        return content;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setModelId(UUID modelId) {
        this.modelId = modelId;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
