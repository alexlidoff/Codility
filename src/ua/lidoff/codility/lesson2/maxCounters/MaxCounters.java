package ua.lidoff.codility.lesson2.maxCounters;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {

        int[] a = {3,4,4,6,1,4,4};
        int n = 5;
        System.out.println(Arrays.toString(a) + " slow solution: " + Arrays.toString(slowSolution(n, a)));
        System.out.println(Arrays.toString(a) + " fast solution: " + Arrays.toString(fastSolution(n, a)));

    }

    private static int[] slowSolution(int n, int[] a) {
        int[] counters = new int[n];
        int max = 0;
        for (int action : a) {
            if (action > n) {
                Arrays.fill(counters, max);
            } else {
                int res = ++counters[action-1];
                if (max < res) {
                    max = res;
                }
            }
        }
        return counters;
    }

    private static int[] fastSolution(int n, int[] a) {
        int[] counters = new int[n];
        int currentMax = 0;
        int lastUpdate = 0;
        for (int action : a) {
            if (action > n) {
                lastUpdate = currentMax;
            } else {
                int counterValue = counters[action-1];
                if (counterValue < lastUpdate) counters[action-1] = lastUpdate + 1;
                else counters[action-1]++;
                if (counters[action-1] > currentMax) currentMax = counters[action-1];
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < lastUpdate) counters[i] = lastUpdate;
        }
        return counters;
    }

}
