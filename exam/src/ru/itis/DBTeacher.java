package ru.itis;

import java.util.Random;


public class DBTeacher implements Teacher {

    private Random random = new Random();

    private double moodCoefficient;
    private int limitIq;
    private String name;
    private String subject;

    public  DBTeacher(int limitIq, String name) {
        this.moodCoefficient = random.nextDouble();
        this.limitIq = limitIq;
        this.name = name;
        this.subject = "DataBase";

    }



    @Override
    public String testStudent(Student student) {
        double luck = random.nextDouble();
        if (student.getIq() > limitIq || (student.getIq() / limitIq) > 1 - moodCoefficient * luck) {
            return "Сдал";
        } else {
            return "Не сдал";
        }


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
    public int getMinIq() {
        return limitIq;
    }

    @Override
    public String getSubject() {
        return subject;
    }
}
