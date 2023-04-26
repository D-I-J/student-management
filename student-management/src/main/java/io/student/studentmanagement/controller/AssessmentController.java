package io.student.studentmanagement.controller;

import io.student.studentmanagement.dto.AssessmentDto;
import io.student.studentmanagement.entity.Assessment;
import io.student.studentmanagement.entity.Student;
import io.student.studentmanagement.service.AssessmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assessments")
public class AssessmentController {

    @Autowired
    AssessmentsService assessmentsService;

    @GetMapping
    public List<AssessmentDto> allAssessments(){
        return assessmentsService.allAssessments();
    }

    @GetMapping("/{id}")
    public AssessmentDto getAssessment(@PathVariable int id){
        return assessmentsService.getAssessment(id);
    }


    @PostMapping
    public AssessmentDto addAssessment(@RequestBody AssessmentDto assessmentDto){
        return assessmentsService.addAssessment(assessmentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAssessment(@PathVariable int id){
        assessmentsService.deleteAssessments(id);
    }

}
