package com.example.mongodbcrud.controller;

import com.example.mongodbcrud.model.RiskAssessment;
import com.example.mongodbcrud.services.RiskAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RiskAssessmentController {

    @Autowired
    private RiskAssessmentService riskAssessmentService;

    // In our actual REST controllers we're going to need to make use of @PostMapping annotation, rather than
    // use a GET @RequestMapping and @Request URL params for every URI as seen in this sample code.
    @RequestMapping("/createRiskAssessment")
    public RiskAssessment createRiskAssessment(@RequestParam String assignee, @RequestParam String title, @RequestParam String question) {
        return riskAssessmentService.createRiskAssessment(assignee, title, question);
    }

    @RequestMapping("/getAllRiskAssessments")
    public List<RiskAssessment> getAllRiskAssessments() {
        return riskAssessmentService.getAllRiskAssessments();
    }

    @RequestMapping("/getRiskAssessmentById")
    public RiskAssessment getRiskAssessmentById(@RequestParam String id) {
        return riskAssessmentService.getById(id);
    }

    @RequestMapping("/updateQuestion")
    public RiskAssessment updateQuestion(@RequestParam String id, @RequestParam String question) {
        return riskAssessmentService.updateQuestion(id, question);
    }

    @RequestMapping("/deleteRiskAssessment")
    public String deleteRiskAssessment(@RequestParam String id) {
        return riskAssessmentService.deleteRiskAssessment(id);
    }

    // Search or (query) endpoint.
    @RequestMapping("/searchByAssignee")
    public List<RiskAssessment> searchByAssignee(@RequestParam String assignee) {
        return riskAssessmentService.searchByAssignee(assignee);
    }
}
