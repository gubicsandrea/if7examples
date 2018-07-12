package algorithms;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class AlgorithmsTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    Algorithms algorithms = new Algorithms();
    List<Integer> numbers = Arrays.asList(4, 7, 2, 5, 3);

    @Test
    public void SumTest() {


        //Given

        //When-Then
        assertEquals(21, algorithms.sum(numbers));
    }

    @Test
    public void sumTest2() {
        //Given

        //When-Then
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("list is empty");
        algorithms.sum(Collections.emptyList());

    }

    @Test
    public void sumTestForNull() {
        //Given

        //When-Then
        expectedException.expect(NullPointerException.class);
        algorithms.sum(null);

    }

    @Test
    public void containsTrue() {

        assertTrue(algorithms.contains(numbers, 7));
    }

    @Test
    public void containsFalse() {

        assertFalse(algorithms.contains(numbers, 132));
    }

    @Test
    public void containsEmptyList() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Empty list!");

        algorithms.contains(Collections.emptyList(), 8);
    }

    @Test
    public void containsNullList() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("List is null!");

        algorithms.contains(null, 8);
    }

    @Test
    public void findFirstTest() {
        assertEquals(1, algorithms.findFirst(numbers, 7));
    }

    @Test
    public void findFirstMultipleTest() {
        List<Integer> numbers2 = Arrays.asList(4, 3, 6, 7, 3, 2, 5, 3);

        assertEquals(1, algorithms.findFirst(numbers2, 3));
    }

    @Test
    public void findFirstMissing() {
        List<Integer> numbers3 = Arrays.asList(4, 3, 6, 7, 3, 2, 5, 3);

        assertEquals(-1, algorithms.findFirst(numbers3, 10));
    }

    @Test
    public void findFirstInEmptyListFail() {
        List<Integer> numbers4 = Arrays.asList();

        expectedException.expect(NullPointerException.class);
        algorithms.findFirst(numbers4, 1);
    }

    @Test
    public void findFirstInNull() {
        expectedException.expect(NullPointerException.class);
        algorithms.findFirst(null, 5);
    }

}
