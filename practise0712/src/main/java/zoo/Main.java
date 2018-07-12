package zoo;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Blöki", 3, 15.3, "Vau");
        dog.move();
        Animal animal = dog;
        System.out.println(animal.getWeight());
        CanMakeSound canMakeSound = dog;
        System.out.println(canMakeSound.getSound());
        if (canMakeSound instanceof Dog) {
            System.out.println(((Dog) canMakeSound).getCage());
        }
    }
}
