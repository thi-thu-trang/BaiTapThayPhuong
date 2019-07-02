package chuong3;

import java.util.Scanner;

public class Bai3_8 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a va b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        BCNN(a, b);
    }

    private static int BCNN(int a, int b) {
        int bc;
        for (bc = a * b; bc >= a; bc--) {
            if (bc % a == 0 && bc % b == 0)
                break;
        }
        System.out.print("Boi chung nho nhat la: " + bc);
        return 0;
    }


}