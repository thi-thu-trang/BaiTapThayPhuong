package chuong3;

import java.util.Scanner;

public class Bai3_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap k:");
        int k = scanner.nextInt();
        System.out.println("Nhap n");
        int n = scanner.nextInt();
        CKN(k, n);
        System.out.println("Gia tri cua to hop la: " + CKN(k, n));
    }

    private static double CKN(int k, int n) {
        if (k == 0 || k == n) return 1;
        if (k == 1) return n;
        return CKN(k, n - 1) + CKN(k - 1, n - 1);
    }
}