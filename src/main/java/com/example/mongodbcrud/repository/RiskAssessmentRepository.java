package com.example.mongodbcrud.repository;

import com.example.mongodbcrud.model.RiskAssessment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RiskAssessmentRepository extends MongoRepository<RiskAssessment, String> {
    public RiskAssessment getById(String id);
    public List<RiskAssessment> searchByAssignee(String assignee);
}
