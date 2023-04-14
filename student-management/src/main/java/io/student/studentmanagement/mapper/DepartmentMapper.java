package io.student.studentmanagement.mapper;
import io.student.studentmanagement.dto.DepartmentDto;
import io.student.studentmanagement.entity.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {
    public Department dtoToEntity(DepartmentDto departmentDto) {
        Department department = new Department();
        department.setDepartmentId(departmentDto.getDepartmentId());
        department.setDepartmentName(departmentDto.getDepartmentName());
        return department;
    }

    public DepartmentDto mapTODto(Department department){
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setDepartmentId(department.getDepartmentId());
        departmentDto.setDepartmentName(department.getDepartmentName());
        return departmentDto;
    }
}
