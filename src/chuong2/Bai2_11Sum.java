package chuong2;

import java.util.Scanner;

public class Bai2_11Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double s = 0;
        for (double i = 1; i <= n; i++) {
            s += (double) 1 / i;

        }
        System.out.printf("%.2f", s);
    }
}
