package ru.itis;

import java.util.Random;

public class MathTeacher implements Teacher {

    private Random random = new Random();

    private double moodCoefficient;
    private int limitIq;
    private String name;
    private String subject;


    @Override
    public String getSubject() {
        return subject;
    }

    public MathTeacher(int limitIq, String name) {
        moodCoefficient = random.nextDouble();
        this.limitIq = limitIq;
        this.name = name;
        this.subject = "Math";
    }


    @Override
    public int getMinIq() {
        return limitIq;
    }

    @Override
    public String getTeacherName() {
        return name;
    }

    @Override
    public Double getTeacherMood() {
        return moodCoefficient;
    }

    @Override
    public String testStudent(Student student) {
        double luck = random.nextDouble();
        if (student.getIq() > this.limitIq || ( (student.getIq() / this.limitIq) > (1 - this.moodCoefficient * luck)) ) {
            return "Сдал";
        } else {
            return "Не сдал";
        }

    }
}
