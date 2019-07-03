package chuong2;

import java.util.Scanner;


public class Bai2_21Primefact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.printf("%d ", i);
                    n = n / i;
                    i--;
                }

            }
        }
    }

}
