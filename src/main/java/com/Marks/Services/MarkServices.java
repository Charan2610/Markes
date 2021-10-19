package com.Marks.Services;

import com.Marks.Models.StudentMarks;

import java.util.List;

public interface MarkServices {

    List<StudentMarks> getStudentMarks();

    StudentMarks addStudentMark(StudentMarks studentMarks);

    StudentMarks updateStudentMark(StudentMarks studentMarks);

    StudentMarks getByIdStudentMark(int id);

    void deleteStudentMark(int id);

    List<StudentMarks> getStudentByID(String stuId);


}
