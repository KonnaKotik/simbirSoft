package main.java.ru.itis.model.teacher;

import main.java.ru.itis.model.Student;

import java.util.Random;

public class MathTeacher extends AbstractTeacher  {

    public MathTeacher(int limitIq, String name) {
        this.limitIq = limitIq;
        this.name = name;
        this.subject = "Math";
    }



}
