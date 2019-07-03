package chuong2;

import java.util.Scanner;

public class Bai2_11Sum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x;
        n = scanner.nextInt();
        x = scanner.nextInt();
        float S = 1;
        int a = 1;
        for (int j = 1; j <= n; j++) {
            a = a * j;
            S += ((float) Math.pow(-1, j) * (float) Math.pow(x, j)) / a;

        }
        System.out.printf("%.2f", S);
    }
}
