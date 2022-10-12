package homework.java;

import java.util.Scanner;

public class HomeWork_06_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("No errors found");
        } else {
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }
        System.out.println("*************************************************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your line");
        String line = sc.nextLine();
        int lineLength = line.length();
        String lastChar = line.substring(line.length() - 1);
        if (lineLength < 6 || !lastChar.equals("!")) {
            System.out.println("Your password is incorrect");
        } else {
            System.out.println("Password accepted");
        }

    }
}
