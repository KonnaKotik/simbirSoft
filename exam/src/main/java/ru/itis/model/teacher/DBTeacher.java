package main.java.ru.itis.model.teacher;


public class DBTeacher extends AbstractTeacher {


    public DBTeacher(int limitIq, String name) {
        this.limitIq = limitIq;
        this.name = name;
        this.subject = "DataBase";

    }
}
