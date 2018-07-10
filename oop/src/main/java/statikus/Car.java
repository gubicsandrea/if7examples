package statikus;

public class Car {

    private String regNumber;

    private static int count = 0;

    public Car(String regNumber) {
        this.regNumber = regNumber;
        count++;
    }

    public Car() {
        count++;
    }

    public Car(Car car){
        this.regNumber = car.getRegNumber();
    }

    public String getRegNumber() {
        return regNumber;
    }

    public static int getCount() {
        return count;
    }
}
