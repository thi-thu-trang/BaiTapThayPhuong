package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_19SymAbility {
    private static boolean Check(int n, ArrayList<Integer> arr) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > 0; j--) {
                if (arr.get(j).equals(arr.get(j))) {
                    return true;
                } else return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0, num;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            num = scn.nextInt();
            arr.add(num);
        }
        Check(n, arr);
        System.out.println(Check(n, arr));
    }
}