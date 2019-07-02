package chuong2;

import java.util.Scanner;

public class Bai2_9Angle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x1, y1, x2, y2, x3, y3;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        Double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        Double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        Double c = (x1 - x2) * (x3 - x2) + (y1 - y2) * (y3 - y2);
        Double d = c / (a * b);
        if (d < 0) {
            System.out.println("3");
        }
        if (d > 0) {
            System.out.println("1");
        }
        if (d == 0) {
            System.out.println("2");
        }

    }
}