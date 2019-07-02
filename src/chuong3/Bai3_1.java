package chuong3;

import java.util.Scanner;

public class Bai3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float x, y;
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        Max(x, y);
    }

    private static double Max(Float x, Float y) {
        Float Max = x;
        if (Max < y)
            Max = y;
        System.out.printf("gia tri lon nhat:" + Max);
        return 0;
    }
}
