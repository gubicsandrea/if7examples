package fruits;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FruitsTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testContains() {
        //Given
        List<String> fruitList = Arrays.asList("alma", "körte", "szilva", "barack");
        Fruits fruits = new Fruits(fruitList);
        String input = "alma";

        //When
        String result = fruits.contains(input);

        //Then
        assertEquals("ok", result);
    }

    @Test
    public void testContainsWhenNotInList() {
        //Given
        List<String> fruitList = Arrays.asList("alma", "körte", "szilva", "barack");
        Fruits fruits = new Fruits(fruitList);
        String input = "dió";

        //When
        String result = fruits.contains(input);

        //Then
        assertEquals("nem ok", result);
    }

    @Test
    public void testContainsWithEmptyList() {
        //Given
        List<String> fruitList = Arrays.asList();
        Fruits fruits = new Fruits(fruitList);
        String input = "dió";

        //When
        String result = fruits.contains(input);

        //Then
        assertEquals("nem ok", result);
    }

    @Test
    public void testNullList() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("cannot be null");

        new Fruits(null);
    }
}
