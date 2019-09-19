package main.java.ru.itis.model.teacher;

import main.java.ru.itis.model.Student;

import java.util.Random;

public abstract class AbstractTeacher implements Teacher {

    private Random random = new Random();

    protected double moodCoefficient = Math.random();
    protected int limitIq;
    protected String name;
    protected String subject;

    public String getTeacherName() {
        return this.name;
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

