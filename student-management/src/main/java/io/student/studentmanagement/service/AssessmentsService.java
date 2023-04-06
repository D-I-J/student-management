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
        return assessmentRepository.findAllAndIsNotDelete();
    }

    public Assessment getAssessment(int id){
        return assessmentRepository.findByIdAndIsNotDelete(id);
    }

    public Assessment addAssessment(Assessment assessment){
        assessment.setAssessmentId(0);
        return assessmentRepository.save(assessment);
    }

    public void deleteAssessments(int id){
        Assessment assessment = assessmentRepository.findById(id).get();
        assessment.setDeleted(true);
        assessmentRepository.save(assessment);
    }
}
