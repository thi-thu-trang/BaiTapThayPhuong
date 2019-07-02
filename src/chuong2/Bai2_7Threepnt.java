package chuong2;

import java.util.Scanner;

public class Bai2_7Threepnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();

        if (((x2 - x1) * (y2 - y1)) / ((x3 - x1) * (y3 - y1)) != 0)
            System.out.println("True");
        else {
            System.out.println("False");

        }
    }

}
