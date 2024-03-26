/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a zoo with various animals.
 * Manages the animals in the zoo and provides methods for their management.
 * Also implements logic for predator/prey interactions.
 * 
 * @author Daniel Zhong
 */
public class Zoo {
    /** List of animals in the zoo. */
    private List<Animal> animals;
    
    /**
     * Constructs a Zoo object with an empty list of animals.
     */
    public Zoo(){
        this.animals = new ArrayList<>();
    }
    
    /**
     * Adds an animal to the zoo.
     * 
     * @param animal the animal to add to the zoo
     */
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    
    /**
     * Displays statistics of all animals in the zoo.
     */
    public void displayStatistics(){
        for(Animal animal: animals){
            System.out.println(animal.toString());
        }
    }

    /**
     * Feeds all animals in the zoo.
     */
    public void feedAllAnimals(){
        for(Animal animal: animals){
            animal.eat();
        }
    }
    
    /**
     * Makes all animals in the zoo rest.
     */
    public void makeAllAnimalsRest(){
        for(Animal animal: animals){
            animal.sleep();
        }
    }
    
    /**
     * Moves all animals in the zoo.
     */
    public void moveAllAnimals(){
        for(Animal animal: animals){
            animal.move();
        }
    }
    
    // How to implement the predator/prey interaction with carnivores/omnivores/herbivores?
    // We need to introduce interfaces for predator and prey, both extending the IEntity interface.
    // Methods for predator would be hunt(), for prey would be runAway().
    // We need to update the Animal class to implement IPredator and IPrey.
    // Boolean attributes to indicate the traits; e.g., isPredator, isPrey, isCarnivore, isOmnivore, isHerbivore.
    // Also, subclass constructors (e.g., LandAnimal, BirdAnimal, and WaterAnimal) should set appropriate attributes.
    // Changes for the Zoo class would involve implementing logic for predator/prey interactions.
    // Logic for hunt would involve comparing speed, position, and maybe adding random events (e.g., change of direction) to simulate realistic hunts.
}
