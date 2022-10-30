package homework.java;

import java.util.Arrays;

public class HomeWork_25_10_2022 {
    public static void main(String[] args) {
        int[] massive = new int[100];

        for (int i = 0; i < 100; i++) {
            massive[i] = 10;
            massive[1] = 0;
            massive[99] = 0;
        }

        System.out.println(Arrays.toString(massive));

        int[] bigMassive = new int[101];
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            bigMassive[i] = i % 10 * 111;
            sum = sum + bigMassive[i];
        }
        System.out.println(sum);
    }
}
