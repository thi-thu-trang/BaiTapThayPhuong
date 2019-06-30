package chuong2;

import java.util.Scanner;

public class Bai2_17Prefect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        int n = scanner.nextInt();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        if (tong == n)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

