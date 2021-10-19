package com.Marks.Services.Impl;

import com.Marks.Dao.MarkRepo;
import com.Marks.Models.StudentMarks;
import com.Marks.Services.MarkServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkServicesImpl  implements MarkServices {


    private MarkRepo markRepo;

    @Autowired
    public void setMarkRepo(MarkRepo markRepo) {
        this.markRepo = markRepo;
    }

    @Override
    public List<StudentMarks> getStudentMarks() {
        return markRepo.findAll();
    }

    @Override
    public StudentMarks addStudentMark(StudentMarks studentMarks) {
        return markRepo.save(studentMarks);
    }

    @Override
    public StudentMarks updateStudentMark(StudentMarks studentMarks) {
        return markRepo.save(studentMarks);
    }

    @Override
    public StudentMarks getByIdStudentMark(int id) {
        return markRepo.findById(id).get();
    }

    @Override
    public void deleteStudentMark(int id) {
        StudentMarks studentMarks= markRepo.findById(id).get();
         markRepo.delete(studentMarks);
    }

    @Override
    public List<StudentMarks> getStudentByID(String stuId) {
      List<StudentMarks> ss= markRepo.getMarkByStudent(stuId);
        System.out.println(ss);
        return ss;
    }

//    public List<StudentMarks> findStudentID(String stuId) {
//        return markRepo.getMarkByStudent(stuId);
//    }
}
