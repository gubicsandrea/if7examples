package book;

import java.util.Arrays;

public class Metodusok {

    public static void main(String[] args) {
//        int[][] tomb = new int[5][];
//        for (int i = 0; i < tomb.length; i++) {
//            tomb[i] = new int[i+1];
//            for (int j = 0; j < tomb[i].length; j++) {
//                tomb[i][j] = 3;
//            }
//        }
//        System.out.println(Arrays.deepToString(tomb));

        int[] numbers = {4, 2, 8, -3, 0};
        int[] numbers2 = {4, 2, 8, -3, 0};

        Arrays.sort(numbers);
        System.out.println(Arrays.equals(numbers, numbers2));
//        String ered = kiir(numbers);
//        System.out.println(ered);
    }

    private static void modosit(String str2) {
        str2 = str2 + "körte";
    }

    private static String kiir(int[] x){
        return Arrays.toString(x);
    }
}
