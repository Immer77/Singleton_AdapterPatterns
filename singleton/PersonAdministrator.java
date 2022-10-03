package singleton;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {
    private static PersonAdministrator uniqueInstance;
    private Set<Person> personer = new HashSet<>();

    private PersonAdministrator(){

    }

    public static synchronized PersonAdministrator getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new PersonAdministrator();
        }
        return uniqueInstance;
    }

    public void addPerson(Person person){
        if(!personer.contains(person)){
            personer.add(person);
        }
    }

    public Set<Person> getPersoner() {
        return new HashSet<>(personer);
    }

    public void removePerson(Person person){
        if(personer.contains(person)){
            personer.remove(person);
        }
    }
}
