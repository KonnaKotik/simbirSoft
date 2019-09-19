package main.java.ru.itis.app;


import main.java.ru.itis.exam.Exam;
import main.java.ru.itis.model.teacher.AbstractTeacher;
import main.java.ru.itis.model.teacher.DBTeacher;
import main.java.ru.itis.model.teacher.MathTeacher;
import main.java.ru.itis.model.Student;
import main.java.ru.itis.model.teacher.Teacher;

import java.util.ArrayList;

public class Main {

    public static final int COUNT_STUDENT =13;

    public static void main(String[] args) {

        AbstractTeacher dbTeacher = new DBTeacher(110, "Якупов А. А.");
        AbstractTeacher mathTeacher = new MathTeacher(98, "Арсланов М.М");

        ArrayList<Student> students = new ArrayList<>();

        for(int i = 0; i < COUNT_STUDENT; i ++ ) {
            students.add(new Student());
        }


        Exam exam = new Exam(students, dbTeacher);
        exam.start();

        Exam exam1 = new Exam(students, mathTeacher);
        exam1.start();


       

    }
}
