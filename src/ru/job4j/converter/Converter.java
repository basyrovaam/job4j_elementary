package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int outEuro = rubleToEuro(in);
        int outDollar = rubleToDollar(in);
        boolean passedEuro = expected == outEuro;
        boolean passedDollar = expected == outDollar;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        System.out.println("140 rubles are 2 dollar. Test result : " + passedDollar);
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
