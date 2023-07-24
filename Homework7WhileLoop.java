package Homework;

import java.util.Scanner;

public class Homework7WhileLoop {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int H = 200;
        int N = 50;
        int M = 1;
        int liftsUp = numberOfLifts(H, N, M);
        System.out.println("Количество подъёмов: " + liftsUp);

//        888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        System.out.println("Введите количество учеников:");
        int student = scanner.nextInt();
        scanner.nextLine();
        counter(student);
    }

    public static void counter(int n) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Введите оценку для ученика " + (i + 1) + ":");
            String grade = scanner.nextLine();
            switch (grade.toUpperCase()) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;
                default:
                    System.out.println("Вы ввели неверную оценку.");
                    i--;
                    break;
            }
        }
        System.out.println("Количество оценок:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
    }


    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int liftsUp = 0;
        while (floor > 0) {
            floor = floor - stepUp;
            liftsUp++;

            if (floor <= 0)
                break;

            floor = floor + stepDown;
        }
        return liftsUp;
    }

}
