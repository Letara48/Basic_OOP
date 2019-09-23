/*
 * All Birds are Animals but all Animals are not Birds
 */
public class Bird extends Animal { // extends all the methods from the parent Animal. this is the child bird inheriting the properties of Animal
    public Bird() { // default constructor bird
        //super(); if need be the super default constructor from parent/super Animal can be here.
        System.out.println("A bird is hatched..."); // the child class bird has its own print statement
    }


    @Override // uses the method sleep with a new return statement specific to bird.
    public String sleep() {
        return "A bird sleeps soundly...";
    }

    @Override // use the method eat from super class/parent Animal with a new return statement specific to bird.
    public String eat() {
        return "A bird eats...";
    }


    public String fly() { //creates a new method specific to bird and independent of Animal.
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}