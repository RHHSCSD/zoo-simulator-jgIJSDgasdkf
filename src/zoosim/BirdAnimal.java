/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Represents a bird in the zoo.
 * Extends the Animal class and implements the IFlyable interface.
 * Provides methods to control flight behavior.
 * 
 * @author Daniel Zhong
 */
public class BirdAnimal extends Animal implements IFlyable {
    private boolean canFly;
    private boolean isFlying;
    
    /**
     * Constructs a BirdAnimal with the specified attributes.
     * 
     * @param id unique identifier for the bird
     * @param name name of the bird
     * @param species species of the bird
     * @param sex gender of the bird
     * @param age age of the bird
     * @param position position of the bird on a Cartesian plane
     * @param size size of the bird in kg
     * @param speed speed of the bird in m/s
     * @param direction direction of the bird in degrees
     * @param canFly true if the bird can fly, false otherwise
     */
    public BirdAnimal(int id, String name, String species, String sex, int age, double[] position, int size, int speed, double direction, boolean canFly){
        super(id, name, species, sex, age, position, size, speed, direction);
        this.canFly = canFly;
    }

    /**
     * Makes the bird take flight.
     * Updates the flying status of the bird.
     */
    @Override
    public void fly() {
        if(canFly){
            isFlying = true;
            System.out.println(super.getFullName() + " is in the air.");
        }else{
            System.out.println(super.getFullName() + " cannot fly.");
        }
    }

    /**
     * Makes the bird land on the ground.
     * Updates the flying status of the bird.
     */
    @Override
    public void land() {
        isFlying = false;
        System.out.println(super.getFullName() + " has landed on the ground");
    }

    /**
     * Checks if the bird is currently flying.
     * 
     * @return true if the bird is flying, false otherwise
     */
    @Override
    public boolean isFlying() {
        return isFlying;
    }
}

