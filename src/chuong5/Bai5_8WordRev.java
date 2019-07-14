package chuong5;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5_8WordRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi1 = scanner.nextLine();
        String chuoi2 = "";
        String[] chuoi3 = chuoi1.split(" ");
        for (int i = chuoi3.length - 1; i >= 0; i--) {
            chuoi2 += chuoi3[i] + " ";

        }
        System.out.println(chuoi2);
    }
}
