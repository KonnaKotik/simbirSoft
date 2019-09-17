package ru.itis;

import ru.itis.name.FirstName;
import ru.itis.name.LastName;
import ru.itis.name.Potronymic;

import java.util.Random;

public class Student {

    final int MIN_IQ = 71;

    private FirstName[] firstNames = FirstName.values();
    private LastName[] lastNames  = LastName.values();
    private Potronymic[] potronymics = Potronymic.values();

    private Random random = new Random();

    private String name;
    private int iq;

    public Student() {
        this.name = getStudentName() ;
        this.iq = random.nextInt(50) + MIN_IQ; // iq студентов от 71 до 121
    }

    private String getStudentName() {
        String studentLastName = lastNames[random.nextInt(lastNames.length)].getLastName();
        String studentFirstName = firstNames[random.nextInt(firstNames.length)].getFisrtName();
        String studentPatronymic = potronymics[random.nextInt(potronymics.length)].getPatronymic();

        return studentLastName + " " + studentFirstName + " " + studentPatronymic;

    }

    public String getName() {
        return name;
    }

    public int getIq() {
        return iq;
    }
}
