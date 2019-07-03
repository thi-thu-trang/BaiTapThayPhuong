package chuong2;

import java.util.Scanner;

public class Bai2_29PrimePow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int a = 1;
        for (int i = 2; i <= n; i++) {
            a *= i;

        }
        int dem = 0;
        while (a % p == 0) {
            dem++;
            a /= p;
        }
        System.out.println(dem);
    }
}
