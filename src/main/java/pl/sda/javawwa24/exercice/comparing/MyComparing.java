package pl.sda.javawwa24.exercice.comparing;

//MyComparing::comparePersons
public class MyComparing {
    public static int comparePersons(Person first, Person second) {
        return first.getSurname().substring(1).compareTo(second.getName().substring(1));
    }
}
