package pl.marapp.model.person;

import java.time.LocalDate;

public class Person {

    private long id;

    private String name;

    private String middleName;

    private String surname;

    private Gender gender;

    private LocalDate birthday;

    private LocalDate calculactedBirthday;

    private int age;

    private Contact contact;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getCalculactedBirthday() {
        return calculactedBirthday;
    }

    public void setCalculactedBirthday(LocalDate calculactedBirthday) {
        this.calculactedBirthday = calculactedBirthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


}
