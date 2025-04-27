package org.example.easy;

import java.util.Scanner;

public class BiggerAndSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int bigger = a > b  && a > c ? a : b > c ? b : c;
        System.out.println(bigger);
    }


}
