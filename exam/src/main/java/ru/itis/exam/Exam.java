package main.java.ru.itis.exam;

import main.java.ru.itis.model.Student;
import main.java.ru.itis.model.teacher.AbstractTeacher;
import main.java.ru.itis.util.FileHelper;

import java.util.List;

public class Exam {
    private List<Student> students;

    private AbstractTeacher teacher;

    public Exam(List<Student> students, AbstractTeacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }


    public void start() {
        FileHelper.writeToFile(this.students, this.teacher);
    }
}
