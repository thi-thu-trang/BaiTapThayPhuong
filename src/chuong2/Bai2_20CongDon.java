package chuong2;

import java.util.Scanner;

public class Bai2_20CongDon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, n;
        do {
            n = scanner.nextInt();
            if (n % 2 == 0)
                sum += n;

        } while (SoNguyenTo(n) == false);
        System.out.println(sum);
    }

    private static boolean SoNguyenTo(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

    }
}

