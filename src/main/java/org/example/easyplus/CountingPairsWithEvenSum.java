package org.example.easyplus;

import java.util.Scanner;

public class CountingPairsWithEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        int result = (countEven * (countEven - 1)) / 2 + (countOdd * (countOdd - 1)) / 2;

        System.out.println(result);
    }
}
