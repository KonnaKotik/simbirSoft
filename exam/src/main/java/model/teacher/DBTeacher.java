package model.teacher;


public class DBTeacher extends AbstractTeacher {


    public DBTeacher(int limitIq, String lastName, String firstName, String patronymic) {
        this.limitIq = limitIq;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.subject = "DataBase";

    }
}
