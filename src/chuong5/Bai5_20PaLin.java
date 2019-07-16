package chuong5;

import java.util.Scanner;

public class Bai5_20PaLin {
    public static boolean SymmetricalNumbers(int n) {
        int sodao = 0, tam, donvi;
        tam = n;
        while (tam > 0) {
            donvi = tam % 10;
            sodao = sodao * 10 + donvi;
            tam /= 10;
        }
        if (sodao == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n + 1; i < 10000; i++) {
            if (SymmetricalNumbers(i) == true) {
                System.out.println(i);
                break;
            }
        }
    }
}

