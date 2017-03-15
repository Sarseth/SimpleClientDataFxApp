package pl.marapp.model;

import org.junit.BeforeClass;

import pl.marapp.model.person.Gender;
import pl.marapp.model.person.Person;
import pl.marapp.model.person.PersonBuilder;

public class CachedPersonDatabaseTest {

    private static CachedPersonDatabase cache;

    @BeforeClass
    public static void beforeClass() {
        cache = new CachedPersonDatabase();
    }

    public void insertPersonIntoEmptyCache() {
        // GIVEN
        Person customer = PersonBuilder.builder("Monika", "Kozuchowska", Gender.FEMALE).build();

        // WHEN

        // THEN
    }
}
