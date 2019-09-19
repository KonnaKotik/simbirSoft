package main.java.ru.itis.util;

import main.java.ru.itis.model.Student;
import main.java.ru.itis.model.teacher.AbstractTeacher;

import java.io.*;
import java.util.List;

public class FileHelper {

    public static void writeToFile(List<Student> students, AbstractTeacher teacher) {


        try (Writer writer =
                     new BufferedWriter(new OutputStreamWriter(
                             new FileOutputStream(
                                     new File(teacher.getSubject() + ".txt"))
                     )
                     )) {
            writer.write(teacher.getTeacherName() + " min IQ = " + teacher.getMinIq() + " mood = " + teacher.getTeacherMood() + "\n" );
            for(Student student : students) {
                writer.write(student.getStudentFullName() + "(IQ = " + student.getIq() + ") - " +  teacher.testStudent(student) + "\n");
            }


        } catch (IOException ex) {
            System.err.println("File not found");
        }

    }
}
