package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean result = (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
        return result;
    }

    public static void main(String[] args) {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean rsl = Triangle.exist(ab, ac, bc);
        System.out.println("Существует ли треугольник? " + rsl);
    }
}


//Нужно проверить, что ab + ac > bc и ac + bc > ab и ab + bc > ac - в этом случае треугольник существует.
//
//В этом задании нужно использовать булеву логику и оператор && (логическое и).