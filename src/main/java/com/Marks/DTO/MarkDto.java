package com.Marks.DTO;

public class MarkDto {

    private int id;
    private String subject;
    private String mark;
    private String student_Id;

    public MarkDto() {
    }

    public MarkDto(String subject, String mark, String student_Id) {
        this.subject = subject;
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
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
