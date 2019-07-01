package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_6DayTang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, num;
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Nhap so phan tu cua mang: ");
        n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            num = scn.nextInt();
            a.add(num);
        }
        int max = 0;
        int[] b = new int[100];
        for (int i = 0; i < n; i++) {
            b[i] = 1;
            for (int j = i; j < n - 1; j++) {
                if (a.get(j) <= a.get(j + 1)) {
                    b[i]++;
                }
                if (a.get(j) > a.get(j + 1)) {
                    break;
                }
            }
            if (b[i] > max) max = b[i];

        }
        System.out.println("Do dai day con tang dan nhieu nhat: " + max);
    }
}
