package ua.lidoff.codility.lesson1.frogJmp;

public class FrogJmp {

    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int d = 30;
        int num = (y - x) / d;
        if (x + d * num < y) num++;
        //another variant:
        //if ((y - x) % d != 0) num++;
        System.out.println(num);
    }

}
