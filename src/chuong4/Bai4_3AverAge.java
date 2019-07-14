package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_3AverAge {
    public static void main(String[] args) {
        ArrayList<Integer> SoChan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            SoChan.add(number);
        }
        float TBC = 0;
        float dem = 0;
        for (int k = 0; k < SoChan.size(); k++) {
            if (SoChan.get(k) % 2 == 0) {
                dem++;
                TBC += SoChan.get(k);

            }
        }
        System.out.printf("%.2f", (TBC / dem));
    }
}
