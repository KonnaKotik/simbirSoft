package ru.itis.name;

public enum FirstName {
    ARINA ("Арина"),
    LIA("Лия"),
    DANEL("Данэль"),
    DARIA("Дария"),
    MARINA("Марина"),
    TIMUR("Тимур");

    private final String firstName;

    FirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFisrtName() {
        return firstName;
    }
}