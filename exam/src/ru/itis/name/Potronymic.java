package ru.itis.name;

public enum Potronymic {
    ALEKSANDROV("Александров"),
    ALEKSEEV("Алексев"),
    ANDREEV("Андреевич"),
    IVANOVICH("Иванович"),
    PETROVICH("Петрович"),
    ILDAROVICH("Ильдарович");

    private final String patronymic;

    Potronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPatronymic(){
        return patronymic;
    }
}
