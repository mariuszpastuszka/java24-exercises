package pl.sda.javawwa24.exercice.comparing;

import java.util.List;

public class Person
//        implements Comparator<Person>
{
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // -1 - before
    // 0 -
    // 1 - after

    static int orderPersons(Person one, Person two) {
        return one.name.compareTo(two.name);
    }

    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("olaf", "wwww"),
                new Person("andrzej", "lichota"));

//        persons.sort((o1, o2) -> Person.orderPersons(o1, o2));
        persons.sort((o1, o2) -> {
            return Person.orderPersons(o1, o2);
        });
        persons.sort(Person::orderPersons);
        persons.sort((first, second) -> MyComparing.comparePersons(first, second));
//        persons.sort(new Person("", ""));
    }

//    @Override
//    public int compare(Person o1, Person o2) {
//        return 0;
//    }
}
