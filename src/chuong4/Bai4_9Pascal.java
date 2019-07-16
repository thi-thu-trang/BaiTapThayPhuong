package chuong4;

import java.util.Scanner;

public class Bai4_9Pascal {
    private static long Pascal(int k, int n) {
        if (k == 0 || k == n) {
            return 1;
        } else return Pascal(k, n - 1) + Pascal(k - 1, n - 1);
    }

    private static void Display() {
        Scanner scn = new Scanner(System.in);
        int n;
        n = scn.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(Pascal(k, i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Display();
    }
}


