package project;

public abstract class AnimalClass {
    private String name;
    private int x;
    private int y;

    public AnimalClass(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveRandomly() {
        this.x = (int) (Math.random() * 101);
        this.y = (int) (Math.random() * 101);
    }

    public double calculateDistance(AnimalClass other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
