/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Interface representing a swimmable entity in the zoo.
 * Defines a method for determining if the entity can surface.
 * 
 * @author Daniel Zhong
 */
public interface ISwimmable {
    
    /**
     * Checks if the entity can surface.
     * 
     * @return true if the entity can surface, false otherwise
     */
    public boolean canSurface();
}
