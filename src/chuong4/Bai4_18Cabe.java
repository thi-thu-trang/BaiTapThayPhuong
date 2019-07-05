package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_18Cabe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, k, s;
        long l, max = 0;
        ArrayList<Long> a = new ArrayList<>();
        System.out.print("Nhap n: ");
        n = scn.nextInt();
        System.out.print("Nhap k: ");
        k = scn.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            l = scn.nextInt();
            a.add(l);
        }
        long L;
        for (L = 1; L < 10000000; L++) {
            s = 0;
            for (int i = 0; i < n; i++) {
                s += a.get(i) / L;
            }
            if (s == k) {
                if (L > max) {
                    max = L;
                }
            }
        }
        System.out.println("Do dai lon nhat: " + max);
    }
}

