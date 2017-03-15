package pl.marapp.model.person;

import java.time.LocalDate;

public class PersonBuilder {

    private Person person;

    public static PersonBuilder builder(String name, String surname, Gender gender) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setGender(gender);
        personBuilder.person = person;
        return personBuilder;
    }

    public PersonBuilder withAge(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder withMiddleName(String middleName) {
        person.setMiddleName(middleName);
        return this;
    }

    public PersonBuilder withBirthdayDate(LocalDate birthdayDate) {
        person.setBirthday(birthdayDate);
        return this;
    }

    public PersonBuilder withContactInfo(Contact contact) {
        person.setContact(contact);
        return this;
    }

    public Person build() {
        return person;
    }

}
