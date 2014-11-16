package ua.lidoff.codility.lesson3.passingCars;

import java.util.Arrays;

public class PassingCars {

    public static void main(String[] args) {
        int[] a = {0,1,0,1,1};
        System.out.println(Arrays.toString(a) + " solution: " + solution(a));
    }

    private static int solution(int[] a) {
        int n = a.length;
        int[] sums = new int[n+1];

        for (int i = 0; i < n; i++) {
            sums[i+1] = sums[i] + a[i];
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                total += (sums[n] - sums[i+1]);
                if (total > 1000000000) {
                    return -1;
                }
            }
        }

        return total;
    }

}
