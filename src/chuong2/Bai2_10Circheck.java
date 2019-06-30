package chuong2;

import java.util.Scanner;

public class Bai2_10Circheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xc, yc, x, y, R;
        xc = scanner.nextInt();
        yc = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        R = scanner.nextInt();
        if (Math.sqrt((x - xc) * (x - xc) + (y - yc) * (y - yc)) < R) {
            System.out.println("1");

        }
        if (Math.sqrt((x - xc) * (x - xc) + (y - yc) * (y - yc)) > R) {
            System.out.println("3");
        }
        if (Math.sqrt((x - xc) * (x - xc) + (y - yc) * (y - yc)) == R) {
            System.out.println("2");
        }

    }
}
