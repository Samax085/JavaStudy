package homework.java;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("введите год: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {

            System.out.println("Год высокосный");
        } else {
            System.out.println("Год невысокосный");
        }
        System.out.println("*************************************************************");

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if (number >=1000) {
            System.out.println("I have money");
        }
        else {
            System.out.println("I haven't money");
        }
        if (number == 777) {
            System.out.println("I have not money, but i am lucky");
        }


    }
}

