package vehicles;

public class Vehicle {

    private int speed;
    private int gears;

    public Vehicle(int speed, int gears) {
        this.speed = speed;
        this.gears = gears;
    }

    public int getSpeed() {
        return speed;
    }

    public void plusSpeed(int number) {
        speed += number;
    }

    public int getGears() {
        return gears;
    }
}