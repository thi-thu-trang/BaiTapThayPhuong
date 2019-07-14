package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_2Sqrsum {
    public static void main(String[] args) {
        ArrayList<Float> SoAm = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            float number = scanner.nextInt();
            SoAm.add(number);
        }
        int tong = 0;
        for (int k = 0; k < SoAm.size(); k++) {
            if (SoAm.get(k) < 0) {
                tong += SoAm.get(k) * SoAm.get(k);

            }
        }
        System.out.println(tong);
    }
}
