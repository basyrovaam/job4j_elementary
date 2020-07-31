package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double sumAmount =  (double) (amount + (amount * percent / 100));
        while (salary < sumAmount) {
            double modulo = sumAmount - salary;
           sumAmount = (double) (modulo + (modulo * percent / 100));
            year += 1;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(100, 70, 50));
        System.out.println(year(1200, 1000, 1));
    }
}

