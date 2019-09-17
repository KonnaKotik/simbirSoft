package ru.itis.name;

public enum LastName {
    KOTIK("Котик"),
    SKRIPKA("Скрипка"),
    SIBAEV("Сибаев"),
    SHAKIROV("Шакиров"),
    ARHIPOVA("Архипова"),
    SHAGIEVA("Шагиева");

    private final String lastName;

    LastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
