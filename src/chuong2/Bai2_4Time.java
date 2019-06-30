package chuong2;

import java.util.Scanner;

public class Bai2_4Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, p, s;
        h = scanner.nextInt();
        p = scanner.nextInt();
        s = scanner.nextInt();
        s++;
        if (s > 59) {
            s = 0;
            p++;
            if (p > 59) {
                h++;
                p = 0;
                if (h > 23) {
                    h = 0;
                }
            }
            System.out.println("gio phut giay tiep theo là" + h + p + s);
        }
        else ;
        System.out.println("nap sai vui long nhap lai");
    }
}
