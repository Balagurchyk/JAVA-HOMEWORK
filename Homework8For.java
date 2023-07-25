package Homework;

import java.util.Scanner;

public class Homework8For {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        counterOneToHundred();
        counterOneToFifty();
        counterOneToThousand();
        sumOfNumbers(6);
        System.out.println(characterCounter("Vpered Dynamo!", 'e'));
    }


    public static int characterCounter(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }

    public static void sumOfNumbers(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }

    public static void counterOneToThousand() {
        int sum = 0;
        for (int i = 2; i <= 1000; i++) {
            if (i * i <= 1000) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void counterOneToFifty() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void counterOneToHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}

