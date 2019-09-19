package main.java.ru.itis.util;

import java.util.Random;

public class NameGenerator {

    private static Random random = new Random();

    private static   final String[] FIRST_NAMES =
            {
                    "Арина", "Алиса", "Марина", "Тимур", "Данэль",};

    private static final String[] LAST_NAMES =
            {
                    "Котик", "Скрипка", "Килина", "Горошко", "Шакиров"
            };

    private static final String[] PATRONYMICS =
            {
                    "Александровна", "Алексевич", "Петрович", "Ильдарович", "Олегович"
            };

    public static String firstNameGenerate() {
        return FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
    }

    public static String lastNameGenerator() {
        return LAST_NAMES[random.nextInt(LAST_NAMES.length)];
    }

    public static String patronymicGenerator() {
        return PATRONYMICS[random.nextInt(PATRONYMICS.length)];
    }




}
