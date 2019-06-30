package chuong2;

import java.util.Scanner;

public class Bai2_25Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v, s = 0, a, b, day = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        v = scanner.nextInt();
        while (true) {
            s += a;
            day++;
            if (s >= v)
                break;
            else {
                s -= b;
            }

        }
        System.out.println("so ngay oc sen bo la: " + day);
    }

}
