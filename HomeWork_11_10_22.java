package homework.java;

import java.util.Scanner;

public class HomeWork_11_10_22 {
    public static void main(String[] args) {
        //First level: Найдите следующее четное число.
        //Например, вводится 140 -> выводим 142, вводится 93 -> выводим 94.
        //Решить задачу с помощью if
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + 2);
        } else {
            System.out.println(number + 1);
        }
        System.out.println("************************************************************");
        //Джон едет на поезде к Мэри. Шерлок Холмс решил вычислить,
        // где сейчас находится Джон: ближе к нему или к Мэри.
        //Шерлок знает, с какой скоростью едет поезд и сколько часов он уже едет.
        // Также он знает, сколько километров длится полная дорога от него к  Мэри.
        //В программу вводится 3 числа: время в пути, скорость поезда, длина полного пути.
        //Вывести на экран имя персонажа, к которому сейчас ближе Джон
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert time is on the way");
        int timeWay = sc.nextInt();
        System.out.println("Insert speed train");
        int speed = sc.nextInt();
        System.out.println("Insert the length of the path");
        int lengthPath = sc.nextInt();
        int middleWay = lengthPath / 2;
        int trainMark = timeWay * speed;
        if (trainMark < middleWay) {
            System.out.println("Sherlock Holms");
        }
        else {
            System.out.println("Marry");
        }
    }
}
