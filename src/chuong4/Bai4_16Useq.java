package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_16Useq {
    public static Boolean ktramang(ArrayList<Integer> a, ArrayList<Integer> b) {
        for (int i = 0; i < a.size(); i++)
            for (int j = 1; j < a.size(); j++) {
                if ((a.get(i) < a.get(j) && b.get(i) > b.get(j)) || a.get(i) == a.get(j) && b.get(i) != b.get(j) || a.get(i) > a.get(j) && b.get(i) < b.get(j)) {
                    return false;
                }
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            Scanner size = new Scanner(System.in);
            ArrayList<Integer> mang1 = new ArrayList<>();
            ArrayList<Integer> mang2 = new ArrayList<>();
            int so = size.nextInt();
            for (int i = 0; i < so; i++) {
                Scanner tam = new Scanner(System.in);
                int test = size.nextInt();
                mang1.add(test);
            }
            for (int i = 0; i < so; i++) {
                int test = size.nextInt();
                mang2.add(test);
            }
            if (ktramang(mang1, mang2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            n--;
        }
    }

}

