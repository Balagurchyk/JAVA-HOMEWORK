//Работу выполнил Виктор Балагурчик.



        package Homework;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Приветствуем! Сколько коробок хотите отправить?");
        Scanner boxes = new Scanner( System.in);
        int boxes1 = boxes.nextInt();
        System.out.println("Сколько весит одна коробка?");
        double KG = boxes.nextDouble();

        Scanner Name = new Scanner( System.in);
        System.out.println("Введите Ваше имя:");
        String Name1 = Name.nextLine();
        System.out.println("Введите Вашу фамилию:");
        String Familia = Name.nextLine();

        System.out.println("Введите адрес доставки:");
        String Adress7 = Name.nextLine();

        System.out.println("Ваше имя: "   + "\"" + Name1.toUpperCase() + " " + Familia.toUpperCase() + "\""+ " "
                + "\n" + "Адрес доставки: " + "\"" + Adress7.toUpperCase() + "\"" + "\n" + "Общий вес посылки: " + (boxes1*KG ) + " кг");

        Scanner yesno = new Scanner(System.in);
        System.out.println("Всё верно? " +"Пожалуйста введите " +"\"yes\"" + " или" + " \"no\"");
        String yesno1 = yesno.next();
        boolean yes = true;
        boolean no = false;
    }
}
