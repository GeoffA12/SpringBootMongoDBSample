package com.example.mongodbcrud.model;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;

import java.time.LocalDateTime;

// Risk Assessment Entity. These are the exact objects which will be stored in our MongoDB Document.
@Document
public class RiskAssessment {
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String assignee;
    private String title;
    private String questions;

    public RiskAssessment(String id, LocalDateTime createdAt, LocalDateTime updatedAt, String assignee, String title, String questions) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.assignee = assignee;
        this.title = title;
        this.questions = questions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public void setUpdatedAt(LocalDateTime localDateTime) {
        this.updatedAt = localDateTime;
    }

    @Override
    public String toString() {
        return "RiskAssessment{" +
                "id='" + id + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", assignee='" + assignee + '\'' +
                ", title='" + title + '\'' +
                ", questions=" + questions +
                '}';
    }
}
