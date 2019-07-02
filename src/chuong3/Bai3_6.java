package chuong3;

import java.util.Scanner;

public class Bai3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n < 0) {
            n = scanner.nextInt();
        }
        phanTich(n);

    }

    private static void phanTich(int n) {
        do {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.printf("%d ", i);
                    n = n / i;
                    i--;
                }
            }
        } while (n > 1);
    }

}