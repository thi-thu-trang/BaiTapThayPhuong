package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_12SetNum {
    public static void main(String[] args) {

        ArrayList<Integer> mang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            mang.add(number);
        }
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang.get(i) == mang.get(j)) {
                    dem++;
                }
            }
        }
        int result = mang.size() - dem;
        System.out.println("So cac phan tu khac nhau: " + result);
    }
}

