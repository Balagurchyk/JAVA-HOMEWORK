package Homework;

import java.util.Scanner;

import java.util.Random;

public class Homework4Boolean {

    public static void main(String[] args) {
        boolean isWeekEnd = true;
        boolean isRain = false;
        boolean canWalk = isWeekEnd && !isRain;
        System.out.println(canWalk);

        boolean isEdekaOpen = true;
        boolean isReweOpen = true;

        System.out.println("Я могу купить еду, это " + canBuy(isEdekaOpen, isReweOpen));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру первой колбы:");
        double temperature1 = scanner.nextDouble();
        System.out.println("Введите температуру второй колбы:");
        double temperature2 = scanner.nextDouble();
        System.out.println(deviceTemperature(temperature1, temperature2));

        Random random = new Random();
        int seconds = random.nextInt(28800);
        System.out.println("До конца рабочего дня осталось " + seconds + " секунд.");
        System.out.println("До конца рабочего дня осталось " + howManyHour(seconds) + " час/а/ов.");
    }

    public static int howManyHour(int sec) {
        int hour = sec / 3600;
        return hour;
    }
    public static boolean canBuy(boolean market1, boolean market2) {
        boolean canBuy = (market1 || market2);
        return canBuy;
    }
    public static boolean deviceTemperature(double flask1, double flask2) {
        boolean hotFlask = flask1 > 100;
        boolean coldFlask = flask2 < 100;
        boolean isCorrect = hotFlask && coldFlask;
        return isCorrect;
    }
}


