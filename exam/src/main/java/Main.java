
import exam.Exam;
import model.Student;
import model.teacher.AbstractTeacher;
import model.teacher.DBTeacher;
import model.teacher.MathTeacher;

import java.util.ArrayList;

public class Main {

    public static final int COUNT_STUDENT =13;

    public static void main(String[] args) {

        AbstractTeacher dbTeacher = new DBTeacher(110, "Якупов", "Алексей", "Владиславович");
        AbstractTeacher mathTeacher = new MathTeacher(98, "Арсланов", "Марат", "Александрович");

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
