package chuong2;

import java.util.Scanner;

public class Bai2_11Sum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double s = 0;
        int a = 1;
        for (int j = 1; j <= n; j++) {
            a = a * j;
            s = s + ((double) 1 / a);
        }
        System.out.printf("%.2f", s);
    }

}


