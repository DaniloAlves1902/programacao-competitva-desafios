package org.example.easyplus;

import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];

        int countE = 0;
        int countO = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (x[i] % 2 == 0) countE++;
            else countO++;
        }

        System.out.println(countE);
        System.out.println(countO);
    }
}
