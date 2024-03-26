/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Represents an object in the zoo.
 * Implements the IObject interface.
 * 
 * @author Daniel Zhong
 */
public class ZooObject implements IObject {
    /** The type of the object (e.g., food, rock, tree). */
    private String type;
    
    /** The position of the object on a Cartesian plane. */
    private double[] position;
    
    /** The size of the object. */
    private int size;
    
    /** The direction of the object. */
    private double direction;
    
    /**
     * Constructs a ZooObject with the specified attributes.
     * 
     * @param type the type of the object
     * @param position the position of the object on a Cartesian plane
     * @param size the size of the object
     * @param direction the direction of the object
     */
    public ZooObject(String type, double[] position, int size, double direction) {
        this.type = type;
        this.position = position;
        this.size = size;
        this.direction = direction;
    }

    /**
     * Turns the object by a certain angle.
     * 
     * @param degrees the angle by which to turn the object
     */
    @Override
    public void turn(double degrees) {
        direction += Math.toRadians(degrees);
    }

    /**
     * Places the object at a specified position.
     * 
     * @param x the x-coordinate of the position
     * @param y the y-coordinate of the position
     */
    @Override
    public void place(double x, double y) {
        position[0] = x;
        position[1] = y;
    }  
}
