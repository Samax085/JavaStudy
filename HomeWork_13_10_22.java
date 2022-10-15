package homework.java;

import java.util.Scanner;

public class HomeWork_13_10_22 {
    public static void main(String[] args) {
        //First level: Вводится число. Напишите на экран сообщение
        //"Я начинаю разбираться с циклами" количество раз, равное этому числу.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        int num = scanner.nextInt();
        int result = 0;
        while (result < num) {
            result++;
            System.out.println("Я начинаю разбираться с циклами");
        }
        System.out.println("******************************************************");
        //Second level: В программу вводится 1 число. Выведите на экран его факториал,
        // используя цикл while
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial");
        int factorial = sc.nextInt();
        long numer = 1;
        int i = 1;
        while (i <= factorial) {
            numer *= i;
            i++;
        }
        System.out.println(numer);
    }
}
