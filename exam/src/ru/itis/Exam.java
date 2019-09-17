package ru.itis;

import java.io.*;
import java.util.List;

public class Exam {
    private List<Student> students;

    private Teacher teacher;

    public Exam(List<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }


    public void start() {

        try (Writer writer =
                     new BufferedWriter(new OutputStreamWriter(
                             new FileOutputStream(
                                     new File(this.teacher.getSubject() + ".txt"))
                     )
                     )) {
            writer.write(teacher.getTeacherName() + " min IQ = " + teacher.getMinIq() + " mood = " + teacher.getTeacherMood() + "\n" );
            for(Student student : students) {
                writer.write(student.getName() + "(IQ = " + student.getIq() + ") - " +  teacher.testStudent(student) + "\n");
            }


        } catch (IOException ex) {
            System.err.println("File not found");
        }


    }
}
