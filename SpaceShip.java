/**
 * SpaceShip.java
 * Student Defined Class
 * Represents a spaceship with a model name, fuel percentage, and warp capabilities.
 */
public class SpaceShip {

    // DATA VARIABLES (Fields)
    // 3 fields with mixed types (String, double, boolean)
    private String modelName;
    private double fuelLevel;
    private boolean isWarpCapable;

    // CONSTRUCTORS

    /**
     * Default Constructor
     * Sets defaults to a generic ship.
     */
    public SpaceShip() {
        this.modelName = "Generic Shuttle";
        this.fuelLevel = 100.0;
        this.isWarpCapable = false;
    }

    /**
     * Parameterized Constructor
     * Allows setting all properties upon creation.
     */
    public SpaceShip(String modelName, double fuelLevel, boolean isWarpCapable) {
        this.modelName = modelName;
        this.fuelLevel = fuelLevel;
        this.isWarpCapable = isWarpCapable;
    }

    // GETTERS AND SETTERS

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        // Validation: Fuel cannot be below 0 or above 100
        if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        } else {
            System.out.println("Error: Fuel level must be between 0 and 100.");
        }
    }

    public boolean getIsWarpCapable() {
        return isWarpCapable;
    }

    public void setIsWarpCapable(boolean isWarpCapable) {
        this.isWarpCapable = isWarpCapable;
    }

    // OVERRIDES

    /**
     * toString method
     * Returns a formatted string describing the spaceship.
     */
    @Override
    public String toString() {
        return "SpaceShip{modelName='" + modelName + "', fuelLevel=" + fuelLevel + "%, isWarpCapable=" + isWarpCapable + "}";
    }
}