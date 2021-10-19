package com.Marks.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentMarks
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Subject;
    private String mark;
    private String student_Id;

    public StudentMarks() {
    }

    public StudentMarks(int id, String subject, String mark, String student_Id) {
        this.id = id;
        Subject = subject;
        this.mark = mark;
        this.student_Id = student_Id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(String student_Id) {
        this.student_Id = student_Id;
    }
}
