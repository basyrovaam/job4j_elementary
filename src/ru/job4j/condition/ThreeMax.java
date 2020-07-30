package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int max;
        int result;
        if (first >= second && first >= third) {
            max = first;
        } else {
            max = second;
        }

        if (max >= first && max >= third && max >= second) {
            result = max;
        } else {
            result = third;
        }
        return result;
    }
}