package chuong3;

import java.util.Scanner;

public class Bai3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        Prime(n);
    }

    public static int Prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int d = 0;
            if (n % i == 0)
                d++;
            if (d == 0)
                System.out.println("true");
            else
                System.out.println("false");
        }
        return 0;
    }
}
