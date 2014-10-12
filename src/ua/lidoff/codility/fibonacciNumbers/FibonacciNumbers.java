package ua.lidoff.codility.fibonacciNumbers;

public class FibonacciNumbers {

    public static void main(String[] args) {

        final int n = 21;
        int res1 = findFibonacciNumber(n);
        System.out.println();
        System.out.println("-----------found by cycle------------------------");
        System.out.println("n = " + n + ":   " + res1);

        int res2 = findFibonacciNumberRecurrence(n);
        System.out.println();
        System.out.println("-----------found by recursion------------------------");
        System.out.println("n = " + n + ":   " + res2);

    }

    private static int findFibonacciNumber(int n) {
        System.out.print("0,1,");
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int prev1 = 1;
        int prev2 = 0;
        int curr = 0;
        for (int i = 2; i <=n ; i++) {
            curr = prev1 + prev2;
            System.out.print(curr);
            if (i < n) {
                System.out.print(",");
            }
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }

    private static int findFibonacciNumberRecurrence(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return findFibonacciNumberRecurrence(n - 1) + findFibonacciNumberRecurrence(n - 2);
    }

}
