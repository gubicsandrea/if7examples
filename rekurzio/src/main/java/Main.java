import faktorialis.Fakt;
import fibonacci.Fibonacci;
import hanoi.Hanoi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Hanoi hanoi = new Hanoi();
//        hanoi.moveDisks(5, 'A', 'B', 'C');
//        System.out.println(hanoi.getResultOfGame());

//        int i = -1;
//        String s = Integer.toBinaryString(i);
//        System.out.println(s);
//        int j = Integer.parseInt(s, 2);
//        System.out.println(j);

        String str = "a:3:4";
        String pattern = null;
        try(Scanner sc = new Scanner(str)){
            sc.useDelimiter(pattern);
            while (sc.hasNext()) {
                System.out.println(sc.nextInt());
            }
        } catch (InputMismatchException ex){
            throw new IllegalArgumentException("Rossz szöveg", ex);
        }
    }

}
