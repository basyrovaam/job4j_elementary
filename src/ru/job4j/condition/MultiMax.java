package ru.job4j.condition;

public class MultiMax {
        public static int max(int first, int second, int third) {
            int max = first >= second ? first : second;
            int result = max >= third ? max : third;
            return result;
        }

    public static void main(String[] args) {
        int first = 3;
        int second = 2;
        int third = 1;
        int rsl = MultiMax.max(first, second, third);
        System.out.println(rsl);
    }
}
