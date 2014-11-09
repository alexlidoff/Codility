package ua.lidoff.codility.lesson2.PermCheck;

import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {

        int[] a = {4,1,3,2};
        int[] b = {4,2,1};

        System.out.println(Arrays.toString(a) + " is permutation : " + isPermutation1(a));
        System.out.println(Arrays.toString(b) + " is permutation : " + isPermutation1(b));
        System.out.println("------------------");
        System.out.println(Arrays.toString(a) + " is permutation : " + isPermutation2(a));
        System.out.println(Arrays.toString(b) + " is permutation : " + isPermutation2(b));

    }

    private static boolean isPermutation1(int[] arr) {
        int n = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > n) {
                n = arr[i];
            }
        }

        int expectedSum = (n * (n+1)) / 2;

        int actualSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum == actualSum;
    }

    private static boolean isPermutation2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) return false;
        }
        return true;
    }

}
