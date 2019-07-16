package chuong4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai4_4MergeArr {
    public static void main(String[] args) {
        int m = 0, n = 0;
        int num1, num2;
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> mang1 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap phan tu thu " + i + " cua mang 1:");
            num1 = scn.nextInt();
            mang1.add(num1);
        }
        ArrayList<Integer> mang2 = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            System.out.println("Nhap phan tu thu " + j + " cua mang 2:");
            num2 = scn.nextInt();
            mang2.add(num2);
        }
        mang1.addAll(mang2);
        Collections.sort(mang2);
        System.out.println(mang2.size() + " " + mang2);
    }
}
