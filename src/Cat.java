/*
 * All Cats are Animals but all Animals are not Cats
 */
public class Cat extends Animal { // inherits the methods of the Animal parent/superclass in the new class Cat

    public Cat() { //the new default constructor Cat
        super(); //inherits the superclass/parent default constructor Cat
        System.out.println("Now I am a Cat!"); //prints a new statement specific to Cat along with the super class statements.
    }

    @Override // uses the same method as the superclass/parent but also a specific statement for the Cat sleeping
    public String sleep() {
        return "A cat sleeps...";
    }

    @Override //uses the same method as the superclass/parent but also a specific statement for the Cat eating
    public String eat() {
        return "A cat eats...";
    }

    public String purr() { //new method specific to the child class Cat
        return "purrr...";
    }

}
