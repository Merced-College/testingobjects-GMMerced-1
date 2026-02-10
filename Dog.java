/**
 * Dog.java
 * Instructor Example Class
 * Represents a Dog with name, age, and breed.
 */
public class Dog {

    // DATA VARIABLES (Fields)
    // Private for encapsulation as per the final lab requirement
    private String name;
    private int age;
    private String breed;

    // CONSTRUCTORS

    /**
     * Default Constructor
     * Sets fields to safe, human-readable defaults.
     */
    public Dog() {
        this.name = "Unknown";
        this.age = 0;
        this.breed = "Mixed";
    }

    /**
     * Parameterized Constructor
     * Initializes all fields with user-provided values.
     */
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Simple validation: Age cannot be negative
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative.");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // OVERRIDES

    /**
     * toString method
     * Returns a string representation of the object instead of the memory address.
     */
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}