package singleton;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {

        Person person1 = new Person("Peter", 24, "0212312");
        Person person2 = new Person("Peter", 24, "0212312");
        Person person3 = new Person("Peter", 24, "0212312");
        Person person4 = new Person("Peter", 24, "0212312");


        PersonAdministrator personAdministrator = PersonAdministrator.getInstance();

        personAdministrator.addPerson(person1);
        personAdministrator.addPerson(person2);
        personAdministrator.addPerson(person3);
        personAdministrator.addPerson(person4);

        System.out.println(personAdministrator.getPersoner());

    }
}
