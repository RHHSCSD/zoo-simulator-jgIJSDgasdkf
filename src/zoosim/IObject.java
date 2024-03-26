/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Interface representing an object in the zoo.
 * Defines methods for object behavior.
 * 
 * @author Daniel Zhong
 */
public interface IObject {
    
    /**
     * Turns the object by a certain angle.
     * 
     * @param degrees the angle by which to turn the object
     */
    public void turn(double degrees);
    
    /**
     * Places the object at a specified position.
     * 
     * @param x the x-coordinate of the position
     * @param y the y-coordinate of the position
     */
    public void place(double x, double y);
}
