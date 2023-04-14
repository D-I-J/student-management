package io.student.studentmanagement.mapper;
import io.student.studentmanagement.dto.AssessmentDto;
import io.student.studentmanagement.entity.Assessment;
import org.springframework.stereotype.Component;

@Component
public class AssessmentMapper {

    public Assessment dtoToEntity(AssessmentDto assessmentDto) {
        Assessment assessment = new Assessment();
        assessment.setAssessmentId(assessmentDto.getAssessmentId());
        assessment.setAssessmentName(assessmentDto.getAssessmentName());
        return assessment;
    }

    public AssessmentDto mapTODto(Assessment assessment){
        AssessmentDto assessmentDto = new AssessmentDto();
        assessmentDto.setAssessmentId(assessment.getAssessmentId());
        assessmentDto.setAssessmentName(assessment.getAssessmentName());
        return assessmentDto;
    }

}
