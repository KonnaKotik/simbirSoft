package main.java.ru.itis.model;

import main.java.ru.itis.util.NameGenerator;

import java.util.Random;

public class Student {

    private static final int MIN_IQ = 71;


    private Random random = new Random();

    private String firstName;
    private String lastName;
    private String patronymic;


    private int iq;

    public Student() {
        this.firstName = NameGenerator.firstNameGenerate();
        this.lastName = NameGenerator.lastNameGenerator();
        this.patronymic = NameGenerator.patronymicGenerator();
        this.iq = random.nextInt(50) + MIN_IQ; // iq студентов от 71 до 121
    }

    public String getStudentFullName() {
        return firstName + " " + lastName + " " + patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
