package Homework_2;

import java.util.Scanner;

public class Main_Averege {
    public static void main(String[] args) {
        Average_Value averege = new Average_Value(113, 15, 0);
        Average_Value averege1 = new Average_Value(113, 131, 124);

        System.out.println(averege.calculate());
        System.out.println(averege1.calculate1());

    }
}
