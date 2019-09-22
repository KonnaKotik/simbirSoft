package exam;

import model.Student;
import model.teacher.AbstractTeacher;
import util.FileHelper;

import java.util.List;

public class Exam {
    private List<Student> students;

    private AbstractTeacher teacher;

    public Exam(List<Student> students, AbstractTeacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    public void start() {

        StringBuilder resultOfExam = new StringBuilder();

        resultOfExam.append(teacher.getFullName() + " min IQ = " + teacher.getMinIq() + " mood = " + teacher.getTeacherMood() + "\n");

        for(Student student : students) {
            resultOfExam.append(student.getStudentFullName() + "(IQ = " + student.getIq() + ") - " +  teacher.testStudent(student) + "\n");
        }

        FileHelper.writeToFile(resultOfExam.toString(), teacher.getSubject());
    }
}
