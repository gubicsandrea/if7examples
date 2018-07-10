package minmax;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main mainObject = new Main();
        int[] a = {3, 5, 9, -1, 3, 0};
        int[] b = {};
        int[] c = {1};
        MinMax minMax = mainObject.findMinMax(c);
        System.out.println(Arrays.toString(c));
        System.out.println("Minimum: " + minMax.getMin() + " Maximum: " + minMax.getMax());
    }

    public MinMax findMinMax(int[] array){
        if(array == null || array.length == 0){
            System.out.println("Hiba");
            return new MinMax(-1, -1);
        }
        int[] firstHalf = Arrays.copyOfRange(array, 0, (array.length + 1) / 2);
        Arrays.sort(firstHalf);
        return new MinMax(firstHalf[0], firstHalf[firstHalf.length-1]);
    }

    /**
     * A bemeneti egész tömb első felében található legnagyobb és legkisebb számot adja vissza
     * @param array a bemenő nem üres tömb
     * @return a kimeneti tömb első eleme a legkisebb, második eleme a legnagyobb számot tartalmazza.
     */
    public int[] findMinMax2(int[] array){
        if(array == null || array.length == 0){
            System.out.println("Hiba");
            return new int[0];
        }
        int[] firstHalf = Arrays.copyOfRange(array, 0, (array.length + 1) / 2);
        Arrays.sort(firstHalf);
        int[] ered = new int[2];
        ered[0] = firstHalf[0];
        ered[1] = firstHalf[firstHalf.length-1];
        return ered;
    }
}
