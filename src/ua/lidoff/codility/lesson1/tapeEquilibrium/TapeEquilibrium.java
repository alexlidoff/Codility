package ua.lidoff.codility.lesson1.tapeEquilibrium;

public class TapeEquilibrium {

    public static void main(String[] args) {

        int[] a = {3,1,2,4,3};
        //int[] a = {145,223,34,3,45,74,348,999,0,3,4,57,24,85,239,57,322,457,934,23,587,57,58,28,288,485,772,295,287};
        //int[] a = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        //int[] a = {-10,-10,0,-10,-10,-10,13,-10,-10,900,-10,-10,-10,-10,1,-10,-711,-10,-10,-10,-10,-10,-10,-10,987};
        //int[] a = {3,9,-10,-7,9};
        //int[] a = {-1,-10,99,-7,0};
        //int[] a = {0,0,0,0,0,0,0};
        bruteForceSolution(a);
        smartSolution(a);

    }

    private static void bruteForceSolution(int[] a) {
        int iterations = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int splitter = 1; splitter < a.length; splitter++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < a.length; i++) {
                iterations++;
                if (i < splitter) {
                    sum1 += a[i];
                } else {
                    sum2 += a[i];
                }
            }
            int diff = Math.abs(sum1 - sum2);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        System.out.println("brute force solution: " + iterations + " iterations; result = " + minDiff);
    }

    private static void smartSolution(int[] a) {
        int iterations = 0;
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            iterations++;
            total += a[i];
        }
        int minDiff = Integer.MAX_VALUE;
        int curr = 0;
        for (int i = 0; i < a.length - 1; i++) {
            iterations++;
            curr += a[i];
            int rest = total - curr;
            int diff = Math.abs(rest - curr);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        System.out.println("smart solution: " + iterations + " iterations; result = " + minDiff);
    }

}

