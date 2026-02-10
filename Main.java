/**
 * Main.java (or ObjectTester.java)
 * This class tests the Dog and SpaceShip objects.
 */
public class Main {

    public static void main(String[] args) {
        
        // ==========================================
        // PART 1: TESTING THE DOG OBJECT
        // ==========================================
        System.out.println("--- TESTING DOG OBJECT ---");

        // 1. Create Dog with Default Constructor
        Dog d1 = new Dog();
        System.out.println("Default Dog (d1): " + d1); // Uses toString()

        // 2. Create Dog with Parameterized Constructor
        Dog d2 = new Dog("Rex", 4, "Collie");
        System.out.println("Parameterized Dog (d2): " + d2);

        // 3. Mutate fields using Setters (since fields are private)
        System.out.println("\nMutating d2 via setters...");
        d2.setAge(5);
        d2.setName("Max");
        d2.setBreed("Border Collie");

        // 4. Print results using Getters and toString
        System.out.println("d2 Age via getter: " + d2.getAge());
        System.out.println("d2 after mutation: " + d2);


        // ==========================================
        // PART 2: TESTING THE STUDENT OBJECT (SpaceShip)
        // ==========================================
        System.out.println("\n--- TESTING SPACESHIP OBJECT ---");

        // 1. Create SpaceShip with Default Constructor
        SpaceShip ship1 = new SpaceShip();
        System.out.println("Default Ship (ship1): " + ship1);

        // 2. Create SpaceShip with Parameterized Constructor
        SpaceShip ship2 = new SpaceShip("Millennium Falcon", 85.5, true);
        System.out.println("Parameterized Ship (ship2): " + ship2);

        // 3. Mutate fields using Setters
        System.out.println("\nMutating ship2 via setters...");
        ship2.setModelName("TIE Fighter");
        ship2.setFuelLevel(45.0);
        ship2.setIsWarpCapable(false); // It's a TIE fighter now, no hyperdrive!

        // 4. Print results
        System.out.println("ship2 Fuel via getter: " + ship2.getFuelLevel());
        System.out.println("ship2 after mutation: " + ship2);
        
        // 5. Test Validator (Attempting invalid fuel)
        System.out.println("\nTesting Validation (Setting fuel to -10):");
        ship2.setFuelLevel(-10); // Should print error message
        System.out.println("Ship fuel remains: " + ship2.getFuelLevel());
    }
}