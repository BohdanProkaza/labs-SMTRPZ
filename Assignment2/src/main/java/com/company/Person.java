package com.company;


import java.util.Objects;

public class Person {
    private final String id;
    private final String name;
    private final String surname;
    private final int age;

    public Person(String id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public int getAge() {
        return age;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(this.getAge(),person.getAge()) &&
                Objects.equals(this.getId(),person.getId()) &&
                Objects.equals(this.getName(),person.getName()) &&
                Objects.equals(this.getSurname(),person.getSurname());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getAge());
    }
}
