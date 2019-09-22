package model.teacher;


public class MathTeacher extends AbstractTeacher  {

    public MathTeacher(int limitIq, String lastName, String firstName, String patronymic){
        this.limitIq = limitIq;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.subject = "Math";
    }



}
