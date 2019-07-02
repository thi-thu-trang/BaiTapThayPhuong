package chuong3;

import java.util.Scanner;

public class Bai3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        UCLN(a, b);

    }

    private static double UCLN(double a, double b) {
        double UC;
        while (a * b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        UC = a + b;


        // for(uc = a;uc>=1;uc--){
        //  if(a%uc==0&& b%uc==0){
        // break;}}


        System.out.println("uoc chung lon nhat la: " + UC);

        return 0;
    }
}