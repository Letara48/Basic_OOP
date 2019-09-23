/*
 * This is the parent class. Also called the super class
 */
public class Animal {
    public Animal() {
        System.out.println("A new animal has been created!"); // prints out a message about a new animal
    }
    public String sleep() {
        return "An animal sleeps..."; // prints out a message about an animal sleeping
    }
    public String eat() {
        return "An animal eats..."; // prints out a message about an animal eating
    }
}