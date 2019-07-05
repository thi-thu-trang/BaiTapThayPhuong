package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_20MinSeg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int n, k, s, number = 0;
        System.out.print("Nhap vao so phan tu cua mang: ");
        n = scn.nextInt();
        System.out.print("Nhap k: ");
        k = scn.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            number = scn.nextInt();
            a.add(number);
        }
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            s = a.get(i) + a.get(j);
            if (s == k) {
                System.out.println(i + " " + j);
            } else j++;
        }
    }
}

