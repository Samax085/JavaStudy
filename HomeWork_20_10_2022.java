package homework.java;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class HomeWork_20_10_2022 {
    public static void main(String[] args) {
        //Level1 (решается через for)
        //Вводится n. Найдите сумму такого выражения: 1+1/2+1/3+1/4…..+1/n.
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number");
        int number = sc.nextInt();
        int result = 0;
        int sum = 0;
        for (int i = 0; i < number; i++) {
            result = i + 1;
            sum = result + 1;
            System.out.println(sum);
        }
        //Level2 (решается через while)
        //Вводится число (число может быть и маленьким и большим),
        //но вмешается в int. Найти сумму всех цифр этого числа.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        int a, c = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            while (a != 0) {
                c = c + a / 10;
                a /= 10;
            }
            System.out.println("The sum of all numbers of the entered number is equal " + c);
        }
        else System.out.println("Not number insert");

    }
}
