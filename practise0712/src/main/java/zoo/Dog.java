package zoo;

public class Dog extends Animal implements CanMakeSound {

    private String sound;

    public Dog(String name, int cage, double weight, String sound) {
        super(name, cage, weight);
        this.sound = sound;
    }

    @Override
    public void move() {
        System.out.println("Run");
    }

    @Override
    public String getSound() {
        return sound;
    }
}
