package chuong2;

import java.util.Scanner;

public class Bai2_30Lucky {
    public static boolean check(int n) {
        int temp = n;
        int donvi;
        int dem = 0;
        int sodem = 0;
        while (temp != 0) {
            donvi = temp % 10;
            sodem++;
            if (donvi == 4 || donvi == 7) dem++;
            temp /= 10;
        }
        if (dem == sodem) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kt = 0;
        int n;
        n = scanner.nextInt();
        for (int i = 1; i < Math.pow(10, 6); i++) {
            if (check(i) == true) kt++;
            if (kt == n) {
                System.out.println("so may man la:" + i);
                break;
            }

        }

    }

}

