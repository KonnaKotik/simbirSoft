package ru.itis;


import java.util.ArrayList;

public class Main {

    public static final int COUNT_STUDENT =13;

    public static void main(String[] args) {

        Teacher teacher = new DBTeacher(110, "Якупов А. А.");
        Teacher teacher1 = new MathTeacher(98, "Арсланов М.М");

        ArrayList<Student> students = new ArrayList<>();

        for(int i = 0; i < COUNT_STUDENT; i ++ ) {
            students.add(new Student());
        }


        Exam exam = new Exam(students, teacher);
        exam.start();

        Exam exam1 = new Exam(students, teacher1);
        exam1.start();


       

    }
}
