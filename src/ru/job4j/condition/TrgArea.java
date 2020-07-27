package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b +c ) / 2;
        double rsl1 = p - a;
        double rsl2 = p - b;
        double rsl3 = p - c;
        double rsl4 = p * rsl1;
        double rsl5 = rsl4 * rsl2 * rsl3;
        double rsl = Math.sqrt(rsl5);
        return rsl;
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double rsl = TrgArea.area(a,b,c);
        System.out.println("Площадь треугольника со сторонами (2, 2, 2) = " + rsl);
    }
}
