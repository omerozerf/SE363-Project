package project;


public class DogClass extends AnimalClass {
    public DogClass(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " is barking!");
    }
}

