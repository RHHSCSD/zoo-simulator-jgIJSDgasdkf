/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Interface representing an entity in the zoo.
 * Extends the IObject interface.
 * Defines methods for entity behavior.
 * 
 * @author Daniel Zhong
 */
public interface IEntity extends IObject {
    
    /**
     * Moves the entity.
     */
    public void move();
    
    /**
     * Makes a sound.
     */
    public void makeSound();
    
    /**
     * Allows the entity to eat.
     */
    public void eat();
    
    /**
     * Allows the entity to sleep.
     */
    public void sleep();
}
