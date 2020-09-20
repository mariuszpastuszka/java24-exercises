package pl.sda.javawwa24.exercice.car;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class Car {
    Optional<Engine> maybeEngine;
}
