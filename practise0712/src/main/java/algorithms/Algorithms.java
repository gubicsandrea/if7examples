package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {

    public int sum(List<Integer> numbers) {
        int sum = 0;

        if (numbers.size() == 0) {
            throw new NullPointerException("list is empty");
        }
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public boolean contains(List<Integer> numbers, int a) {
        if (numbers == null) {
            throw new NullPointerException("List is null!");
        }
        if (numbers.size() == 0) {
            throw new NullPointerException("Empty list!");
        }
        return numbers.contains(a);
    }

    public int findFirst(List<Integer> numbers, int a) {
        if (numbers == null) {
            throw new NullPointerException("List is null!");
        }
        if (numbers.isEmpty()) {
            throw new NullPointerException("Empty list!");
        }
        int find = -1;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == a) {
                find = i;
                break;
            }
        }
        return find;
    }

    public List<Integer> findAllSmaller(List<Integer> numbers, int a) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : numbers) {
            if (integer < a) {
                result.add(integer);
            }
        }
        return result;
    }

    public int findMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (Integer integer : numbers) {
            if (min > integer) {
                min = integer;
            }
        }
        return min;
    }

    public int countLarger(List<Integer> numbers, int a) {
        int count = 0;
        for (Integer integer : numbers) {
            if (integer > a) {
                count++;
            }
        }
        return count;
    }
}
