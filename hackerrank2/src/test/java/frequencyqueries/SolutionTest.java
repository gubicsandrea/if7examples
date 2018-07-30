package frequencyqueries;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void testFreqQuery() {
        String input = "20\n" +
                "1 3\n" +
                "1 38\n" +
                "2 1\n" +
                "1 16\n" +
                "2 1\n" +
                "2 2\n" +
                "1 64\n" +
                "1 84\n" +
                "3 1\n" +
                "1 100\n" +
                "1 10\n" +
                "2 2\n" +
                "2 1\n" +
                "1 67\n" +
                "2 2\n" +
                "3 1\n" +
                "1 99\n" +
                "1 32\n" +
                "1 58\n" +
                "3 2";
        String output = "1\n" +
                "1\n" +
                "0";
        List<List<Integer>> queries = readInput(input);
        List<Integer> ans = Solution.freqQuery(queries);

        assertThat(writeOutput(ans), equalTo(output));
    }

    private List<List<Integer>> readInput(String str) {
        Scanner scanner = new Scanner(str);
        int q = Integer.parseInt(scanner.nextLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            queries.add(
                    Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList())
            );
        });
        return queries;
    }

    private String writeOutput(List<Integer> ans) {
        return ans.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
    }
}
