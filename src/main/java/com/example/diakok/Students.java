package com.example.diakok;

public class Students {
    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    private int studentsLength;

    public int getStudentsLength() {
        return studentsLength;
    }

    public void setStudentsLength(int studentsLength) {
        this.studentsLength = studentsLength;
    }

    public Students() {
        students = new Student[200];
    }
}
