public class Dog extends Animal {

    @Override
    public String sleep() {
        return "The dog is asleep. Let sleeping dogs lie sleeping.";
    }

    @Override
    public String eat() {
        return "Dogs are always hungry. Let the dog eat.";
    }

    public Dog() {
        System.out.println("The dog was created by humans.");

    }
    public String bark() {
        return "Dogs bark a lot.";
    }
}
