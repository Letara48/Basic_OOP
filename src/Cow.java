public class Cow extends Animal {

    @Override
    public String sleep() {
        return "Do cows sleep?";
    }
    @Override
    public String eat() {
        return "The cow eats with multiple stomachs.";
    }

    public Cow() {
        super();
        System.out.println("Look there's a cow!");

    }
}
