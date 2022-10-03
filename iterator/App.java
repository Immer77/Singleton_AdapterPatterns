package iterator;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person("Peter");
        Person person2 = new Person("Peter2");
        Person person3 = new Person("Peter3");
        Person person4 = new Person("Peter4");
        PersonCollection people = new PersonCollection(16);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        Iterator iterator = people.iterator();

        try {
            while (iterator.hasNext()){
                Person curPerson = (Person) iterator.next();
                System.out.println(curPerson);
                people.remove(1); //Tester om vi rammer catch
            }

        }catch (ConcurrentModificationException ce){
            System.out.println(ce.getMessage());
        }

    }
}
