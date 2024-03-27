/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.lang.Math;
/**
 * Representing Animal 
 * @author Daniel Zhong
 */
public abstract class Animal implements IEntity {
    private int id;
    private String name;
    private String species;
    private String sex;
    private int age;
    private double[] position;
    private int size;
    private double speed;
    private double direction;
    private int hunger;
    private int fatigue;
    private Image image;
    private String sound;
    private final String fullName;
    
    /**
     *
     * @param id                unique identifier to the animal
     * @param name              name for the animal
     * @param species           species of the animal
     * @param sex               gender of the animal
     * @param age               age of the animal
     * @param position          position of the animal on a Cartesian plane
     * @param size              size of the animal in kg
     * @param speed             speed of the animal in m/s
     * @param direction         the direction of the animal in degrees, will be converted to radians for calculation in the class
     */
    public Animal(int id, String name, String species, String sex, int age, double[] position, int size, int speed, double direction ){
        this.id = id;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.position = position;
        this.size = size;
        this.speed = speed;
        this.direction = Math.toRadians(direction);
        this.fullName = name + " the " + species;
        this.hunger = 0;
        this.fatigue = 0;
    }

    /**
     * 
     * Makes the animal move(only if the animal is not hunger and not tired) in the direction currently facing
     * Updates the new coordinate after moving
     */
    @Override
    public void move() {
        if(hunger-10 <= 0 && fatigue-10 <= 0){
            System.out.println("Please feed or rest " + fullName);
        }else{
            System.out.println(fullName + " is moving towards " + Math.toDegrees(direction) +" degree and moving at a speed of " + speed + " m/s for 1 second");
            position[0] += speed * Math.cos(direction);
            position[1] += speed * Math.sin(direction);
            hunger -= 10;
            fatigue -= 10;
        }
    }

    /**
     * Makes the animal make the sound that belongs to them
     */
    @Override
    public void makeSound() {
        System.out.println(fullName + " is makingn a sound: " + sound + "!");
    }

    /**
     * Replenish the hunger for the animal
     */
    @Override
    public void eat() {
        hunger = 100;
        System.out.println( fullName + " is full after their meal.");
    }

    /**
     * Replenish the fatigue of the animal
     */
    @Override
    public void sleep() {
        fatigue = 100;
        System.out.println(fullName + " is no longer tired after sleeping.");
    }

    /**
     * Turn the animal by a certain angle
     * @param degrees
     *      
     * 
     */
    @Override
    public void turn(double degrees) {
        direction += Math.toRadians(degrees);
    }

    /**
     * place the animal in a new point
     * @param x
     * @param y
     */
    @Override
    public void place(double x, double y) {
        this.position[0] = x;
        this.position[1] = y;
    }
    
    //getters

    /**
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return species
     */
    public String getSpieces() {
        return species;
    }

    /**
     *
     * @return
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return x-coordinate
     */
    public double getX() {
        return position[0];
    }

    /**
     *
     * @return y-coordinate
     */
    public double getY() {
        return position[1];
    }

    /**
     *
     * @return size
     */
    public double getSize() {
        return size;
    }

    /**
     *
     * @return speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     *
     * @return direction
     */
    public double getDirection() {
        return Math.toDegrees(direction);
    }

    /**
     *
     * @return hunger
     */
    public int getHunger() {
        return hunger;
    }

    /**
     *
     * @return fatigue
     */
    public int getFatigue() {
        return fatigue;
    }

    /**
     *
     * @return image
     */
    public Image getImage() {
        return image;
    }
    
    /**
     *
     * @return sound
     */
    public String getSound() {
        return sound;
    }

    /**
     *
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     *
     * @return position
     */
    public String getPosition() {
        return "("+position[0] + "," + position[1]+")";
    }
    
    
    
    //setters

    /**
     * set id
     * @param id
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set species
     * @param species
     */
    public void setSpieces(String species) {
        this.species = species;
    }

    /**
     * set sex
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * set age
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * set x
     * @param x
     */
    public void setX(double x) {
        this.position[0] = x;
    }

    /**
     * set y
     * @param y
     */
    public void setY(double y) {
        this.position[1] = y;
    }

    /**
     * set size
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     *  set speed
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * set direction
     * @param direction
     */
    public void setDirection(double direction) {
        this.direction = Math.toRadians(direction);
    }

    /**
     * set hunger
     * @param hunger
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    /**
     * set fatigue
     * @param fatigue
     */
    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    /**
     * set image
     * @param image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * set sound
     * @param sound
     */
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    /**
     *
     * @return the specific detail and statistics of the animal
     */
    @Override
    public String toString() {
        return "Animal:{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", position=" + position[0]+ ","+ position[1] +
                ", hunger=" + hunger +
                ", fatigue=" + fatigue+
                '}';
    }
    
}

