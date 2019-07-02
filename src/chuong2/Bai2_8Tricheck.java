package chuong2;

import java.util.Scanner;

public class Bai2_8Tricheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}