/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Represents a land animal in the zoo.
 * Extends the Animal class.
 * 
 * @author Daniel Zhong
 */
public class LandAnimal extends Animal {

    /**
     * Constructs a LandAnimal with the specified attributes.
     * 
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
    public LandAnimal(int id, String name, String species, String sex, int age, double[] position, int size, int speed, double direction) {
        super(id, name, species, sex, age, position, size, speed, direction);
    }
}
