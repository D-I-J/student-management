package io.student.studentmanagement.service;

import io.student.studentmanagement.entity.Assessment;
import io.student.studentmanagement.repository.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentsService {

    @Autowired
    private AssessmentRepository assessmentRepository;

    public List<Assessment> allAssessments(){
        return assessmentRepository.findAll();
    }

    public Assessment getAssessment(int id){
        return assessmentRepository.findById(id).get();
    }

    public Assessment addAssessment(Assessment assessment){
        assessment.setAssessmentId(0);
        return assessmentRepository.save(assessment);
    }

    public void deleteAssessments(int id){
        assessmentRepository.deleteById(id);
    }
}
