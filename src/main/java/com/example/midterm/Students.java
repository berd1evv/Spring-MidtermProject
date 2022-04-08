package com.example.midterm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;
    private String first_name;
    private String last_name;
    private String faculty;
    private Float gpa;

    public Students() {
    }

    public Students(Integer studentId, String firstName, String lastName, String faculty, Float gpa) {
        this.student_id = studentId;
        this.first_name = firstName;
        this.last_name = lastName;
        this.faculty = faculty;
        this.gpa = gpa;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(student_id, students.student_id) && Objects.equals(first_name, students.first_name) && Objects.equals(last_name, students.last_name) && Objects.equals(faculty, students.faculty) && Objects.equals(gpa, students.gpa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student_id, first_name, last_name, faculty, gpa);
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + student_id +
                ", firstName='" + first_name + '\'' +
                ", lastName='" + last_name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", GPA=" + gpa +
                '}';
    }
}
