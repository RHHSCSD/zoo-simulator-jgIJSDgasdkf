/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Interface representing a flyable entity in the zoo.
 * Defines methods for flight behavior.
 * @author Daniel Zhong
 */
public interface IFlyable {
    
    /**
     * Makes the entity take flight.
     */
    public void fly();
    
    /**
     * Makes the entity land.
     */
    public void land();
    
    /**
     * Checks if the entity is currently flying.
     * 
     * @return true if the entity is flying, false otherwise
     */
    public boolean isFlying();
}
