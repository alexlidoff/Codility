package ua.lidoff.codility.lesson1.permMissingElem;

import java.util.Arrays;


public class PermMissingElem {

    public static void main(String[] args) {
        int[] a = {2,3,1,5};
        System.out.println("solution1: " + solution1(a));
        System.out.println("solution2: " + solution2(a));
    }

    private static long solution1(int[] a) {
        long n = a.length + 1;
        long expectedTotal = (n*(n+1)) / 2;
        long actualTotal = 0;
        for (int i = 0; i < a.length; i++) {
            actualTotal += a[i];
        }
        return expectedTotal - actualTotal;
    }

    private static int solution2(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int expected = i + 1;
            if (expected != a[i]) {
                return expected;
            }
        }
        return a.length + 1;
    }

}
