package chuong2;

import java.util.Scanner;

public class Bai2_16Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = scanner.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int d = 0;
            if (n % i == 0)
                d++;
            if (d == 0)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

}

