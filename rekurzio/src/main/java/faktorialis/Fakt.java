package faktorialis;

public class Fakt {

    public int faktorial(int n){
        if(n == 0){
            return 1;
        }
        return n * faktorial(n - 1);
    }

    public int faktWithIteration(int n){
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }
}
