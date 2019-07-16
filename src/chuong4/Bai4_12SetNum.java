package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_12SetNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0, num;
        ArrayList<Integer> arr = new ArrayList<>();
        try {
            System.out.println("Nhap so phan tu cua mang: ");
            n = scn.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            num = scn.nextInt();
            arr.add(num);
        }
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) == arr.get(j)) {
                    dem++;
                }
            }
        }
        int result = arr.size() - dem;
        System.out.println("So cac phan tu khac nhau: " + result);
    }
}

