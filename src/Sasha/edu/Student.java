package Sasha.edu;

import sun.util.calendar.BaseCalendar;

import java.time.LocalDate;
import java.util.Objects;

/*
@USER: GR
@DATE: 20.03.2021
@NAME: Person
*/public class Student {
    private LocalDate dateOfEntry;
    private String firstname;
    private String midName;
    private String lastName;
    private String University;
    private String specialty;
    private String faculty;
    private String course;

    public Student(LocalDate dateOfEntry, String firstname, String midName, String lastName, String university, String specialty, String faculty, String course) {
        this.dateOfEntry = dateOfEntry;
        this.firstname = firstname;
        this.midName = midName;
        this.lastName = lastName;
        University = university;
        this.specialty = specialty;
        this.faculty = faculty;
        this.course = course;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dateOfEntry=" + dateOfEntry +
                ", firstname='" + firstname + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", University='" + University + '\'' +
                ", specialty='" + specialty + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(dateOfEntry, student.dateOfEntry) && Objects.equals(firstname, student.firstname) && Objects.equals(midName, student.midName) && Objects.equals(lastName, student.lastName) && Objects.equals(University, student.University) && Objects.equals(specialty, student.specialty) && Objects.equals(faculty, student.faculty) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfEntry, firstname, midName, lastName, University, specialty, faculty, course);
    }

    public Student() {

    }
}