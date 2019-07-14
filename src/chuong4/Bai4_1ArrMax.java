package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_1ArrMax {
    public static void main(String[] args) {
        ArrayList<Integer> mangmax = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            mangmax.add(number);
        }
        int max = mangmax.get(0);
        for (int k = 0; k < mangmax.size(); k++) {
            if (mangmax.get(k).compareTo(max) > 0) {
                max = mangmax.get(k);
            }
        }
        System.out.println(max);
    }
}
