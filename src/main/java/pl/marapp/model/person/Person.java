package pl.marapp.model.person;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Person {

    private final LongProperty id = new SimpleLongProperty();

    private final StringProperty name = new SimpleStringProperty();

    private final StringProperty middleName = new SimpleStringProperty();

    private final StringProperty surname = new SimpleStringProperty();

    private final ObjectProperty<Gender> gender = new SimpleObjectProperty<>();

    private final ObjectProperty<LocalDate> birthday = new SimpleObjectProperty<>();

    private final ObjectProperty<LocalDate> calculactedBirthday = new SimpleObjectProperty<>();

    private final IntegerProperty age = new SimpleIntegerProperty();

    private final ObjectProperty<Contact> contact = new SimpleObjectProperty<>();

    public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getMiddleName() {
        return middleName.get();
    }

    public StringProperty middleNameProperty() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName.set(middleName);
    }

    public String getSurname() {
        return surname.get();
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public Gender getGender() {
        return gender.get();
    }

    public ObjectProperty<Gender> genderProperty() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender.set(gender);
    }

    public LocalDate getBirthday() {
        return birthday.get();
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public LocalDate getCalculactedBirthday() {
        return calculactedBirthday.get();
    }

    public ObjectProperty<LocalDate> calculactedBirthdayProperty() {
        return calculactedBirthday;
    }

    public void setCalculactedBirthday(LocalDate calculactedBirthday) {
        this.calculactedBirthday.set(calculactedBirthday);
    }

    public int getAge() {
        return age.get();
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public Contact getContact() {
        return contact.get();
    }

    public ObjectProperty<Contact> contactProperty() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact.set(contact);
    }
}
