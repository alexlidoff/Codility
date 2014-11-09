package ua.lidoff.codility.lesson2.missingInteger;

import java.util.Arrays;

public class MissingInteger {

    public static void main(String[] args) {

        int[] a = {1,3,6,4,1,2};
        //int[] a = {-1};
        //int[] a = {-1,0,0,0,3,9,7,4,1,6,4,1,2,1,2,4,5,8,23,44,30,0,0,1,0,-10,-245,10};
        System.out.println(Arrays.toString(a) + " solution1 : " + solution1(a));

    }

    private static int solution1(int[] a) {
        Arrays.sort(a);
        int counter = 0;
        int prev = 0;
        for (int i = 0; i < a.length ; i++) {
            if (a[i] > 0 && (i == 0 || a[i] != prev)) counter++;
            prev = a[i];
            if (counter > 0 && a[i] != counter) return counter;
        }
        return ++counter;
    }

}
