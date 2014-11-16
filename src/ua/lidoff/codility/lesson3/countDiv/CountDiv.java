package ua.lidoff.codility.lesson3.countDiv;

public class CountDiv {

    public static void main(String[] args) {
        int a = 11;
        int b = 345;
        int k = 17;
        System.out.println(a + " - " + b + " / " + k + " solution: " + solution(a, b, k));
    }

    private static int solution(int a, int b, int k) {
        return b/k - (a/k - (a%k == 0 ? 1 : 0));
    }

}
