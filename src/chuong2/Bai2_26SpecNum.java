package chuong2;

import java.util.Scanner;

public class Bai2_26SpecNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;
        int dem = 0;
        A = scanner.nextInt();
        B = scanner.nextInt();
        for (int i = A; i <= B; i++) {
            if (check(i) == true) ;
            dem++;
        }
        System.out.println(dem);
    }


    private static boolean check(int n) {
        int tongchan = 0, tongle = 0;
        while (n != 0) {
            if ((n % 10) % 2 == 0) {
                tongchan += (n % 10);
                n = n / 10;
            } else {
                tongle += (n % 10);
                n = n / 10;
            }
        }
        if (tongchan == tongle)
            return true;
        else
            return false;
    }
}
