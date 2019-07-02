package chuong3;

import java.util.Scanner;

public class Bai3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap a va b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        ToiGian(a, b);
    }

    private static void ToiGian(int a, int b) {
        int uc;
        for (uc = 2; uc <= a; uc++) {
            if (a % uc == 0 && b % uc == 0) {
                break;
            }
        }
        a = a / uc;
        b = b / uc;
        System.out.printf("Phan so toi gian la: %d/%d ", a, b);
    }
}