package pl.sda.javawwa24.exercice.calculator;

import java.util.Optional;

public class Calculator {

    public static void main(String[] args) {
        Add adder = (c, d) -> {
//            this.
//            System.out.println("inside lambda");
            return c + d;
        };
        System.out.println(adder);
        System.out.println(adder.toString());
        System.out.println(adder.add(5.0, 3.0));

        Sub sub = (a, b) -> { System.out.println("");
            return a - b;
        };

//        GenericAdd<Integer> genericAdd = (Integer a, Integer b) -> a + b;
        GenericAdd<Integer> genericAdd = (a, b) -> a + b; //.+(a, b)
//        GenericAdd whatsThis = (a, b) -> a + b;

//        getNick().length();
//        getNickWithOptional().get();

        if (getNickWithOptional().isPresent()) {
            getNickWithOptional().get();
        }

        getNickWithOptional()
                .ifPresent(s -> {});

        getNickWithOptional() // Optional<String>
                .map(s -> s.length()) // Optional<Integer>
                .ifPresent(integer -> System.out.println("Nick len: " + integer));
        Optional<String> nick = getNickWithOptional(); // Optional<String>

                nick.map(s -> s.length()); // Optional<Integer>
//                .ifPresent(integer -> System.out.println("Nick len: " + integer));

//        Comparable<Person> stringComparable = otherPerson -> 0;
    }

    // String String?
    static String getNick() {
        return null;
    }
    int a;
    static Optional<String> getNickWithOptional() {

        return Optional.ofNullable(null);
    }
}
