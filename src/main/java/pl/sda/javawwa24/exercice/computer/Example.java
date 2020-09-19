package pl.sda.javawwa24.exercice.computer;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {
        Computer fullComputer = new Computer(new GraphicsCard(new Chip("nVidia")));
        Computer withoutGC = new Computer(null);
        Computer fake = null;

        printChipVendorSafeWay(fullComputer);
        printChipVendorSafeWay(withoutGC);
        printChipVendorSafeWay(fake);
        printChipVendorNaive(fullComputer);
        printChipVendorNaive(withoutGC);
        printChipVendorNaive(fake);

    }

//    static void printChipVendorOptionalWay(Computer computer) {
//        Optional.ofNullable(computer)
//                .map(computer1 -> computer1.getGraphicsCard())
//                .map(graphicsCard -> graphicsCard.getChip())
//                .map(chip -> chip.getVendor())
//                .ifPresent(s -> System.out.println("Vendor (Optional): " + s));
//    }
    static void printChipVendorOptionalWay(Computer computer) {
        Optional.ofNullable(computer)
                .map(Computer::getGraphicsCard)
                .map(GraphicsCard::getChip)
                .map(Chip::getVendor)
                .ifPresent(System.out::println);
    }

    static void printChipVendorNaive(Computer computer) {
        System.out.println("Vendor: " + computer.getGraphicsCard().getChip().getVendor());
    }

    static void printChipVendorSafeWay(Computer computer) {
        if (computer != null) {
            GraphicsCard graphicsCard = computer.getGraphicsCard();
            if (graphicsCard != null) {
                Chip chip = graphicsCard.getChip();
                if (chip != null) {
                    System.out.println("Graphics card vendor (safe way): " + chip.getVendor());
                }
            }
        }
    }
}
