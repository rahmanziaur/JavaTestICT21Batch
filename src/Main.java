// Main Class
public class Main {

    public static void main(String[] args) {

        /*
         * Parent reference, Child object
         * Demonstrates Runtime Polymorphism
         */
        Car car = new ToyotaPremio(
                "White",
                "Premio G Superior",
                "Japan",
                2023,
                "Sedan"
        );

        System.out.println("\n--- Method Calls ---");

        // Calls overridden method of ToyotaPremio
        car.carType();

        // Calls overridden method of ToyotaPremio
        car.status();
    }
}