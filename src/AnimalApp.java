public class AnimalApp { //main class that incorporates the Animal superclass/parent and the subclass/children

    public static void main(String[] args) { // establishes main as a class that will not return anything specifically

        Animal a = new Animal(); // The animal class with the object 'a' is being created.
        print(a.eat()); // the object 'a' will use the method eat to print out a statement
        print(a.sleep()); // the object 'b' will use the method sleep to print out a statement.

        Cat c = new Cat(); //the cat class object 'c' will be created.
        print(c.eat()); // the object 'c' will use the method eat to print out a statement. This was overridden from inherited Animal class
        print(c.sleep()); // the object 'c' will use the method sleep to print out a statement. This was overridden from inherited Animal class
        print(c.purr()); // the object 'c' will use the method purr to print out a statement. This is independent of the Animal class


        Bird b = new Bird(); // the bird 'b' will be created
        print(b.eat()); // the object 'b' will use the method eat to print out a statement. This was overridden from inherited Animal class
        print(b.sleep()); //the object 'b' will use the method eat to print out a statement. This was overridden from inherited Animal class
        print(b.fly()); //the object 'b' will use the method fly to print out a statement. This is independent of the Animal class.

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.bark());

        Cow cw = new Cow();
        print(cw.eat());
        print(cw.sleep());
    }

    private static void print(String s) { //Not clear where s is defined. The string 's' will be printed out through its own method created in main.
        System.out.println(s);
    }
}
