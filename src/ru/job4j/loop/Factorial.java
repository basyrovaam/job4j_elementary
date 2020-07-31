package ru.job4j.loop;

public class Factorial {
    public static int calc(int start, int finish) {
        int result = 1;
        if (start == 0) {
            start = 1;
        }
        for (int index = start; index <= finish; index++) {
            result = result * index;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(1, 5));
        System.out.println(calc(0, 0));
        System.out.println(calc(1, 1));
    }
}