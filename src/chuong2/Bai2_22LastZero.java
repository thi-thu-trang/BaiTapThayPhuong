package chuong2;

import java.util.Scanner;

public class Bai2_22LastZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long a = GiaiThua(n);
        int dem = 0;
        while (a > 0) {
            if (a % 10 == 0) {
                dem++;
                a /= 10;
            } else break;
        }
        System.out.println(dem);
    }


    private static long GiaiThua(int n) {
        int s = 1;
        if (n == 0)
            return 1;
        else {
            for (int i = 1; i <= n; i++)
                s *= i;
        }
        return s;

    }
}
