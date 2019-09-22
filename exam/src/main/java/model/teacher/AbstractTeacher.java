package model.teacher;

import model.Student;
import java.util.Random;

public abstract class AbstractTeacher implements Teacher {

    private Random random = new Random();

    protected double moodCoefficient = Math.random();
    protected int limitIq;
    protected String firstName;
    protected String lastName;
    protected String patronymic;
    protected String subject;

    public String getFullName() {
        return this.lastName + " " + this.lastName + " " + this.patronymic;
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

    public Double getTeacherMood() {
        return this.moodCoefficient;
    }


    public String getSubject() {
        return this.subject;
    }


    public int getMinIq() {
        return this.limitIq;
    }


    @Override
    public String testStudent(Student student) {
        double luck = random.nextDouble();
        if (student.getIq() > this.limitIq || ((student.getIq() / this.limitIq) > (1 - this.moodCoefficient * luck))) {
            return "Сдал";
        } else {
            return "Не сдал";
        }

    }
}

