package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }

            }
        return prime;
    }

        public static void main(String[] args) {
            System.out.println(check(5));
            System.out.println(check(4));
            System.out.println(check(1));
            System.out.println(check(2));
        }
    }
