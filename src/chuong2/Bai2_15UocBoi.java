package chuong2;

import java.util.Scanner;

public class Bai2_15UocBoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a, b;
        Double UCLN;
        System.out.println("nhap 2 so a va b:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        //public static int USCLN(int a, int b) {
        //  if (b == 0) return a;
        //  return USCLN(b, a % b);
        System.out.println(a);
        System.out.println(b);
        while (a * b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }//ham nay dieu kien dung la a va b = nhau ... hen gi no lap vo  tan nay h
        //hoi nay cai ham do sai ... ham do khong full dieu kien nen sinh ra ngoai le
        //anh out 1
        UCLN = a + b;
        System.out.println("uoc chung lon nhat=" + UCLN);
        System.out.println("boi chung nho nhat:" + ((a * b) / UCLN));

    }
}

