package zoo;

public abstract class Animal {

    private String name;
    private int cage;
    private double weight;

    public Animal(String name, int cage, double weight) {
        this.name = name;
        this.cage = cage;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getCage() {
        return cage;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void move();
}
