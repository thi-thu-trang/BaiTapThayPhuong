package chuong2;

import java.util.Scanner;

public class Bai2_13DemLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, dem = 0;
        do {
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {

                if (n % 2 != 0) {
                    dem++;
                    break;
                }
            }
        } while (n != 0);


        System.out.println("tong cac so le:" + dem);
    }
}
