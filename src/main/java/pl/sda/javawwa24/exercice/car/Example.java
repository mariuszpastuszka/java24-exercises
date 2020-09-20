package pl.sda.javawwa24.exercice.car;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {

    }

    static void checkLightFromCar(Car car) {
        Optional.ofNullable(car)
                .flatMap(car1 -> car1.maybeEngine)
                .map(engine -> engine.getSpark())
                .flatMap(spark -> spark.getLight())
                .map(light -> light.getLight())
                .ifPresent(string -> System.out.println(string));
    }
}
