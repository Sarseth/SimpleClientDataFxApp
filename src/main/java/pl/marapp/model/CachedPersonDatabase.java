package pl.marapp.model;

import java.util.HashMap;
import java.util.Map;

import pl.marapp.model.person.Person;

public class CachedPersonDatabase {

    private Map<Long, Person> personCache;

    private Long nextId;

    public void reloacCache() {
        // GO TO FILE
        for(Person person : personCache.values()) {
            if(nextId == null || person.getId() > nextId) {
                nextId = person.getId();
            }
        }
    }

    public void addPerson(Person person) {
        prepCacheIfNeeded();
        person.setId(nextId);
        personCache.put(nextId, person);
        nextId++;
    }

    public void removePerson(Long personId) {
        personCache.remove(personId);
    }

    public void removePerson(Person person) {
        removePerson(person.getId());
    }

    private void prepCacheIfNeeded() {
        if(personCache == null) {
            personCache = new HashMap<>();
            nextId = 1L;
        }
    }


}
