package fruits;

import java.util.Arrays;
import java.util.List;

public class Fruits {

    private List<String> fruits;

    public Fruits(List<String> fruits) {
        if (fruits == null) {
            throw new IllegalArgumentException("cannot be null");
        }
        this.fruits = fruits;
    }

    public String contains(String fruit) {
        return fruits.contains(fruit) ? "ok" : "nem ok";
    }
}
