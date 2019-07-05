package chuong5;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai5_11LogSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger m = scanner.nextBigInteger();
        BigInteger n = scanner.nextBigInteger();
        BigInteger add;
        add = m.add(n);
        System.out.println(add);
    }
}
