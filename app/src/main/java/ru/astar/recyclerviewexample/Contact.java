package ru.astar.recyclerviewexample;

public class Contact {
    String name;
    String phone;
    Sex sex;

    public Contact(String name, String phone, Sex sex) {
        this.name = name;
        this.phone = phone;
        this.sex = sex;
    }
}

enum Sex {
    MAN, WOMAN
}

