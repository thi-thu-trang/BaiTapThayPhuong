package chuong2;

import java.util.Scanner;

public class Bai2_18CountSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, dem = 0, tong = 0;
        do {

            n = scanner.nextInt();
        }
        while (n < 0);

        while (n > 0) {
            dem++;
            tong += n % 10;
            n /= 10;
        }
        System.out.println("chu so la:" + dem);
        System.out.println("tong cac chu so" + tong);

    }
}
