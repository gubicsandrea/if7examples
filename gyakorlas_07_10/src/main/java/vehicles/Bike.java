package vehicles;

public class Bike extends Vehicle{

    private int numberOfWheels;
    private int frameSize;
    private int frontGears;
    private int rearGears;
    private Type type;
    private Category category;

    public Bike(int numberOfWheels, int frameSize,int speed, int frontGears, int rearGears, Type type, Category category) {
        super(speed,frontGears * rearGears);
        this.numberOfWheels = numberOfWheels;
        this.frameSize = frameSize;
        this.frontGears = frontGears;
        this.rearGears = rearGears;
        this.type = type;
        this.category = category;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public int getFrontGears() {
        return frontGears;
    }

    public int getRearGears() {
        return rearGears;
    }

    public Type getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }

}
