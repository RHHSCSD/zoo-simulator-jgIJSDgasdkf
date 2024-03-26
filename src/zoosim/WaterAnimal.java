/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Represents a water animal in the zoo.
 * Extends the Animal class and implements the ISwimmable interface.
 * 
 * @author Daniel Zhong
 */
public class WaterAnimal extends Animal implements ISwimmable {
    /** Indicates if the water animal can breathe underwater. */
    private boolean canBreathe;

    /**
     * Constructs a WaterAnimal with the specified attributes.
     * 
     * @param canBreathe true if the water animal can breathe underwater, false otherwise
     * @param id unique identifier for the animal
     * @param name name of the animal
     * @param species species of the animal
     * @param sex gender of the animal
     * @param age age of the animal
     * @param position position of the animal on a Cartesian plane
     * @param size size of the animal in kg
     * @param speed speed of the animal in m/s
     * @param direction direction of the animal in degrees
     */
    public WaterAnimal(boolean canBreathe, int id, String name, String species, String sex, int age, double[] position, int size, int speed, double direction) {
        super(id, name, species, sex, age, position, size, speed, direction);
        this.canBreathe = canBreathe;
    }

    /**
     * Checks if the water animal can surface.
     * 
     * @return true if the water animal can surface, false otherwise
     */
    @Override
    public boolean canSurface() {
        return canBreathe;
    }
}
