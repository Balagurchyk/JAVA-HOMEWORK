package Homework;

import java.util.Scanner;

public class Homework5IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        double num = scanner.nextDouble();
        checkNumbers(num);

        System.out.println("Введите целое число:");
        double evenuneven = scanner.nextDouble();
        checkEven(evenuneven);

        System.out.println("Введите год:");
        int year = scanner.nextInt();
        boolean leapYear = isYearLeap(year);
        if (leapYear) {
            System.out.println("Этот год високосный!");
        } else {
            System.out.println("Этот год не високосный!");
        }


        System.out.println("Введите балл, который Вы получили:");
        int rating = scanner.nextInt();
        System.out.println("Ваша оценка:");
        System.out.println(checkMark(rating));

        scanner.nextLine();
        System.out.println("Введите название месяца на английском языке:");
        String month = scanner.nextLine();
        System.out.println(seasons(month));

    }

    public static void checkNumbers(double x) {

        boolean positivex = x > 0;
        boolean negativex = x < 0;
        if (positivex) {
            System.out.println("Это число положительное!");
        } else if (negativex) {
            System.out.println("Это число отрицательное!");
        } else {
            System.out.println("Это число равно нулю!");
        }
      }
    public static void checkEven(double y) {
        double eveny = y % 2;
        boolean isEven = eveny == 0;
        if (isEven) {
            System.out.println("Это число чётное!");
        } else {
            System.out.println("Это число нечётное!");
        }
    }


        public static boolean isYearLeap ( int year){
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return false;
        }

    public static String checkMark(int mark) {
        if (90 <= mark && mark <= 100) {
            return "A";
        } else if (80 <= mark && mark < 90) {
            return "B";
        } else if (70 <= mark && mark < 80) {
            return "C";
        } else if (60 <= mark && mark < 70) {
            return "D";
        } else if (0 <= mark && mark < 60) {
            return "F";
        } else {
            return "Введены неверные данные! Попробуйте ещё раз!";
        }
    }

        public static String seasons( String month) {
            if (month.equalsIgnoreCase("december") || month.equalsIgnoreCase("january") || month.equalsIgnoreCase("february")) {
                return "is Winter!";
            } else if (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may")) {
                return "is Spring!";
            } else if (month.equalsIgnoreCase("june") || month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august")) {
                return "is Summer!";
            } else if (month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october") || month.equalsIgnoreCase("november")) {
                return "is Autumn!";
            } else {
                return "Incorrect data";
            }
        }

}
