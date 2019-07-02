package chuong3;

import java.util.Scanner;

public class Bai3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        Max(a, b, c);

    }

    private static float Max(float a, float b, float c) {
        float Max = a;
        if (Max < b) Max = b;
        if (Max < c) Max = c;
        System.out.printf("so lon nhat la " + Max);
        return 0;
    }
}

