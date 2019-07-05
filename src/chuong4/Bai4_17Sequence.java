package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_17Sequence {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            a.add(number);
        }
        int max1 = 0;
        int f = 0;
        int i = a.get(0);
        int j = a.get(1);
        for (int k = 2; k < n; k++) {
            max1 = i + 2 * j + 3 * a.get(k);
        }
        if (max1 >= f) {
            f = max1;
        }
        int max2 = 0;
        for (j = 1; j < n - 1; j++) {
            for (int k = 2; k < n; k++) {
                max2 = i + a.get(j) + 3 * a.get(k);
            }
        }
        if (max2 >= f) {
            f = max2;
        }
        int max3 = 0;
        for (i = 0; i < n - 2; i++) {
            for (j = 1; j < n - 1; j++) {
                for (int k = 2; k < n; k++) {
                    max3 = a.get(i) + a.get(j) + 3 * a.get(k);
                }
            }
        }
        if (max3 >= f) {
            f = max3;
        }
        System.out.println(f);
    }

}
