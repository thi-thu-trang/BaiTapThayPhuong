package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_14Del {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int number, tong = 0, chan = 0;
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            number = scanner.nextInt();
            list.add(number);
        }
        for (int i = 0; i < n; i++) {
            tong = tong + list.get(i);
            if (list.get(i) % 2 == 0) {
                chan++;
            }
        }
        if (tong % 2 == 0) {
            System.out.println(chan * (chan - 1) / 2 + (n - chan) * (n - chan - 1) / 2);
        } else System.out.println(chan * (n - chan));
    }
}
