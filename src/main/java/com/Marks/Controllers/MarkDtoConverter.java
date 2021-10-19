package com.Marks.Controllers;


import com.Marks.DTO.MarkDto;
import com.Marks.Models.StudentMarks;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MarkDtoConverter {


    public MarkDto entityToDto(StudentMarks marks){

        MarkDto mark= new MarkDto();
        mark.setId(marks.getId());
        mark.setMark(marks.getMark());
        mark.setSubject(marks.getSubject());
        mark.setStudent_Id(marks.getStudent_Id());
        return mark;
    }

    public List<StudentMarks> getAllStudentMarks(List<MarkDto> marks){
        return  marks.stream().map(u -> dtoToEntity(u)).collect(Collectors.toList());


    }

    public List<MarkDto> getAllMarkDTO(List<StudentMarks> studentsMarks){
        return  studentsMarks.stream().map(u -> entityToDto(u)).collect(Collectors.toList());


    }

    public StudentMarks dtoToEntity(MarkDto markDto){
        StudentMarks stuMark= new StudentMarks();
        stuMark.setId(markDto.getId());
        stuMark.setMark(markDto.getMark());
        stuMark.setSubject(markDto.getSubject());
        stuMark.setStudent_Id(markDto.getStudent_Id());
        return stuMark;

    }
}
