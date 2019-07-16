package chuong4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai4_4MergeArr {
    public static void main(String[] args) {
        int m = 0, n = 0;
        int num1, num2;
        Scanner scn = new Scanner(System.in);
        try {
            m = scn.nextInt();
            n = scn.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap phan tu thu " + i + " cua mang 1:");
            num1 = scn.nextInt();
            arr1.add(num1);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            System.out.println("Nhap phan tu thu " + j + " cua mang 2:");
            num2 = scn.nextInt();
            arr2.add(num2);
        }
        arr1.addAll(arr2);
        Collections.sort(arr1);
        System.out.println(arr1.size() + " " + arr1);
    }
}
