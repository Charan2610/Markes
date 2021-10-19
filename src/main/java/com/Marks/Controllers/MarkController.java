package com.Marks.Controllers;

import com.Marks.DTO.MarkDto;
import com.Marks.Models.StudentMarks;
import com.Marks.Services.Impl.MarkServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MarkController {

    private MarkServicesImpl markServicesImpl;

    @Autowired
    public void setMarkServicesImpl(MarkServicesImpl markServicesImpl) {
        this.markServicesImpl = markServicesImpl;
    }

    private MarkDtoConverter markDtoConverter;

    @Autowired
    public void setMarkDtoConverter(MarkDtoConverter markDtoConverter) {
        this.markDtoConverter = markDtoConverter;
    }


    @GetMapping("/marks")
    public List<MarkDto> getAllMakesDetails(){
      List<StudentMarks> markes=  markServicesImpl.getStudentMarks();
      List<MarkDto> mDTo=  markDtoConverter.getAllMarkDTO(markes);
      return mDTo;
    }


    @PostMapping("/addMark")
    public MarkDto addMark(@RequestBody MarkDto markDto){
       StudentMarks mark= markDtoConverter.dtoToEntity(markDto);
       StudentMarks mm=  markServicesImpl.addStudentMark(mark);
       MarkDto mdto=  markDtoConverter.entityToDto(mm);
       return mdto;
    }

    @GetMapping ("/Mark/{id}")
    public MarkDto getMark(@PathVariable("id") int id){
//        StudentMarks studentMarks=  markDtoConverter.dtoToEntity(markDto);
        StudentMarks stuMark= markServicesImpl.getByIdStudentMark(id);
        MarkDto mdto= markDtoConverter.entityToDto(stuMark);
        return mdto;
    }


    @PutMapping("/updateMark")
    public MarkDto updateMark(@RequestBody StudentMarks mm){
//        StudentMarks studentMarks=  markDtoConverter.dtoToEntity(markDto);
      StudentMarks stuMark= markServicesImpl.updateStudentMark(mm);
      MarkDto mdto= markDtoConverter.entityToDto(stuMark);
        return mdto;
    }

    @GetMapping("student/{stuId}")
    public List<StudentMarks> studentData(@PathVariable("stuId") String StuId){
      List<StudentMarks> marks=  markServicesImpl.getStudentByID(StuId);
      return marks;
    }

    @DeleteMapping("/deleteMark/{id}")
    public void deleteStudentMark(@PathVariable("id") int id){
        markServicesImpl.deleteStudentMark(id);
    }



}
