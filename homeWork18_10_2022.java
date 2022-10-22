package homework.java;

import java.util.Scanner;

public class homeWork18_10_2022 {
    public static void main(String[] args) {
//First level:
//Дано целое число, не меньшее 2.
// Выведите его наименьший делитель, отличный от 1.
//(число, на которое введенное число делится без остатка).
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Lowest divisor " + 2);
        } else {
            System.out.println("Lowest divisor " + 3);
        }
//Level2
//Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов,
// после чего дробная часть копеек отбрасывается.
// Каждый год сумма вклада становится больше.
// Определите, сколько будет на счету через k лет.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your deposit");
        int deposit = scanner.nextInt();
        System.out.println("Interest rate");
        int rate = scanner.nextInt();
        System.out.println("How old is your deposit?");
        int depositYears = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < depositYears; i++) {
            sum = (deposit * rate) / 100;

            deposit = deposit + sum;
        }

        System.out.println(deposit);

    }
}