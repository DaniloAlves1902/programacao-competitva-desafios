package org.example.easyplus;

import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

            if (array[i] > 0 && (array[i] % 3 == 0 || array[i] % 5 == 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
