package project;


public class CatClass extends AnimalClass {
    public CatClass(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(getName() + " is meowing!");
    }
}

