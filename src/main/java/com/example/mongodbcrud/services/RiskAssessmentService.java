package com.example.mongodbcrud.services;

import com.example.mongodbcrud.model.RiskAssessment;
import com.example.mongodbcrud.repository.RiskAssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class RiskAssessmentService {

    @Autowired
    private RiskAssessmentRepository riskAssessmentRepository;

    public RiskAssessment createRiskAssessment(String assignee, String title, String question) {
        String id = UUID.randomUUID().toString();
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime createdAt = current;
        LocalDateTime updatedAt = current;
        RiskAssessment riskAssessmentForPersistence = new RiskAssessment(id, createdAt, updatedAt, assignee, title, question);
        return riskAssessmentRepository.save(riskAssessmentForPersistence);
    }

    public List<RiskAssessment> getAllRiskAssessments() { return riskAssessmentRepository.findAll(); }

    public RiskAssessment getById(String id) {
        return riskAssessmentRepository.getById(id);
    }

    public RiskAssessment updateQuestion(String id, String question) {
        RiskAssessment riskAssessment = riskAssessmentRepository.getById(id);
        riskAssessment.setQuestions(question);
        riskAssessment.setUpdatedAt(LocalDateTime.now());
        return riskAssessmentRepository.save(riskAssessment);
    }

    public String deleteRiskAssessment(String id) {
        RiskAssessment existing = riskAssessmentRepository.getById(id);
        riskAssessmentRepository.delete(existing);
        return "Removed risk assessment " + existing.toString() + " from document";
    }

    public List<RiskAssessment> searchByAssignee(String assignee) {
        return riskAssessmentRepository.searchByAssignee(assignee);
    }

}
