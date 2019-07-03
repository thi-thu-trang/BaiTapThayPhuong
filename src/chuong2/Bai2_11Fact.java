package chuong2;

import java.util.Scanner;

public class Bai2_11Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double s = 1;
        for (double i = 1; i <= n; i++) {
            s = s * i;
        }
        System.out.printf("%.2f", s);
    }
}
