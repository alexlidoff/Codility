package ua.lidoff.codility.naturalNumbersSum;

public class CalculateNaturalNumbersSum {

    public static void main(String[] args) {

        final int n = 10;

        int total1 = calcTotalSlow(n);
        System.out.println(total1);

        int total2 = calcTotalFast(n);
        System.out.println(total2);

    }

    public static int calcTotalSlow(int n) {

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;

    }

    public static int calcTotalFast(int n) {

        return n * (n + 1) / 2;

    }

}
