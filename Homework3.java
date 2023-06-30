//Работу выполнил Виктор Балагурчик


//Описание задания.
//
//        1 уровень сложности: - введите 2 слова используя сканер, состоящие из четного количества букв (проверьте количество букв в слове).
//
//        создайте метод "returnNewWord", который принимает в качестве аргумента 2 строки и возвращает тоже строку.
//        Получите слово, состоящее из первой половины первого слова и второй половины второго слова.
//        Предполагаем, что пользователь вводит корректные данные.
//
//
//        "aabb", "ccdd" -> "aadd"
//        "12", "abcd" -> "1cd"
//        убедитесь, что ваш код работает, прежде чем сдавать.
//        убедитесь, что ваш код возвращает корректные значения для слов разной длины.
//        слова считываются НЕ в методе returnNewWord, там происходит только обработка
//
//
//
//        Реализовать программу, которая выводит на экран результаты сложения, вычитания, умножения и деления двух чисел.
//        Каждая из арифметических операций должна быть реализована как отдельный метод.
//        каждый отдельный метод принимает в качестве аргументов два числа и возвращает тоже число
//
//
//        реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
//        метод принимает два числа - сумму в евро и текущий курс (количество долларов, которое дают за 1 евро).
//        метод ничего не возвращает, но печатает в консоль:
//        "при курсе … USD за один EUR, при обмене … EUR, вы получте … USD".
//

package Homework;

import java.util.Scanner;
public class Homework3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово с чётным количеством букв:");
        String word1 = scanner.nextLine();
        System.out.println("Введите второе слово с чётным количеством букв:");
        String word2 = scanner.nextLine();
        System.out.println(word1.length());
        System.out.println(word2.length());
        System.out.println(returnNewWord(word1, word2));

        //88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        System.out.println("Введите первое число:");
        double chislo1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double chislo2 = scanner.nextDouble();
        System.out.println(summe(chislo1, chislo2));
        System.out.println(minus(chislo1, chislo2));
        System.out.println(umnojit(chislo1, chislo2));
        System.out.println(delit(chislo1, chislo2));

//8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        System.out.println("Сколько ЕВРО хотите поменять?");
        double eur = scanner.nextDouble();
        System.out.println("Введите курс ЕВРО/ДОЛЛАР:");
        double kursusd = scanner.nextDouble();
        converter(eur, kursusd);
    }


    public static void converter(double summ, double kurs) {


        double eur = summ;
        double kursusd = kurs;
        double convertation = summ * kurs;
        System.out.println("При курсе " + kursusd + " USD за один EUR, при обмене " + eur + " EUR, вы получите " + convertation + " USD");
    }

    public static double summe(double x, double y) {
        double result = x + y;
        return result;

    }

    public static double minus(double x, double y) {
        double result = x - y;
        return result;
    }

    public static double umnojit(double x, double y) {
        double result = x * y;
        return result;
    }

    public static double delit(double x, double y) {
        double result = x / y;
        return result;
    }

    public static String returnNewWord(String str1, String str2) {
        str1 = str1.substring(0, str1.length() / 2);
        str2 = str2.substring(str2.length() / 2, str2.length());
        String str3 = str1 + str2;
        return str3;
    }
}

