package Sasha.edu;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student sasha = new Student();
        sasha.setDateOfEntry(LocalDate.of(2019, 10, 20));
        sasha.setFirstname("Sasha");
        sasha.setLastName("Rayman");
        sasha.setMidName("Miroslavovich");
        sasha.setUniversity("Bukovinsky");
        sasha.setSpecialty("ComputerScience");
        sasha.setFaculty("ITE");
        sasha.setCourse("2");
        System.out.println(sasha);
    }
}