package ua.lidoff.codility.lesson2.frogRiverOne;

import java.util.Arrays;

public class FrogRiverOne {

    public static void main(String[] args) {
//                 0 1 2 3 4 5 6 7
        int[] a = {1,3,1,4,2,3,5,4};
        int x = 5;
        System.out.println(Arrays.toString(a) + "; x = " + x);
        System.out.println("solution1: " + solution(x, a));

    }

    private static int solution(int x, int[] a) {
        int[] bridge = new int[x+1];
        bridge[0] = 1;
        int stepsCounter = 0;

        for (int i = 0; i < a.length; i++) {
            int position = a[i];
            if (position > x) {
                continue;
            }
            if (bridge[position] == 0) {
                bridge[position] = 1;
                stepsCounter++;
            }
            if (stepsCounter == x) {
                return i;
            }
        }

        return -1;
    }

}
