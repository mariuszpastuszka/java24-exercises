package pl.sda.javawwa24.exercice;

import java.util.Optional;
import java.util.function.Function;

class StringMapper implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
@FunctionalInterface
interface DoubleString {
    String doubleDouble(String value);
    default String tripleTriple(String value) {return "";}
}

class MyDoubleStringImpl implements DoubleString {

    @Override
    public String doubleDouble(String value) {
        return value + value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class LambdaExample {

    public static void main(String[] args) {
        DoubleString myDoubleString = (String value) -> value + value;
        System.out.println(myDoubleString.toString());
        System.out.println(myDoubleString.doubleDouble("Ola"));

        DoubleString myDoubleString2 = (String value) -> value + value;
        System.out.println(myDoubleString2);

        System.out.println("StringMapper: " + (new StringMapper()).toString());

        Function<String, Integer> myFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Function<String, Integer> myFunction2 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        String myName = "Mariusz";
        Optional<String> maybeName = Optional.ofNullable(myName);
        maybeName.map(new Function<String, Object>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });
        maybeName.map(new StringMapper());

        maybeName.map((String s) -> s.length());
        maybeName.map(s -> s.length());

    }
}
