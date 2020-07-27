package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl =  (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 178;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println(man + " is best weight for man with height 178");
        System.out.println(woman + " is best weight for woman with height 178");
    }
}

//Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
//
//Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.