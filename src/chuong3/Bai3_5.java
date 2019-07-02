package chuong3;

import java.util.Scanner;

public class Bai3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int tong = 0;
        Perfect(n);

    }

    public static int Perfect(int n) {
        int tong = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                tong += i;

        }
        if (tong == n)
            System.out.println("TRUE");
        else
            System.out.println("False");
        return 0;
    }
}
