/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 * main program
 * @author michael.roy-diclemen
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        BirdAnimal blueJay = new BirdAnimal(1,"Bob","Blue Jay", "M", 3, new double []{0,1}, 12, 2, 0.0, true);
        Zoo zoo = new Zoo();
        zoo.addAnimal(blueJay);
        blueJay.fly();
        blueJay.move();
        System.out.println(blueJay.getFatigue());
        zoo.feedAllAnimals();
        zoo.makeAllAnimalsRest();
        System.out.println(blueJay.getFatigue());
        blueJay.move();
        System.out.println(blueJay.getPosition());
        blueJay.turn(90);
        blueJay.move();
        System.out.println(blueJay.getPosition());
        zoo.displayStatistics();
    }
    
}
