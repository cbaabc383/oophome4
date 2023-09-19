package ru.geekbrains.lesson4.bank;

/**
 * Физ. лицо
 */
public class Person implements PersonalData{

    private final String fio;

    private final String inn;

    @Override
    public String getInn() {
        return inn;
    }

    public String getFio() {
        return fio;
    }

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("ИНН: %s; ФИО: %s", inn, fio);
    }
}
