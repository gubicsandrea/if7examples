package fibonacci;

public class Fibonacci {

    public int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int fibWithIteration(int n) {
        int[] pre = new int[n];
        pre[0] = 0;
        pre[1] = 1;
        for (int i = 2; i < n; i++) {
            pre[i] = pre[i - 1] + pre[i - 2];
        }
        return pre[n - 1];
    }
}
