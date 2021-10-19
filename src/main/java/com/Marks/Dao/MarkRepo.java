package com.Marks.Dao;

import com.Marks.Models.StudentMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepo  extends JpaRepository<StudentMarks,Integer> {

    @Query("from StudentMarks s  where s.student_Id =:student_Id")
   List<StudentMarks> getMarkByStudent(@Param("student_Id") String StuId);



}
