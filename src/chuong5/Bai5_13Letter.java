package chuong5;

import java.util.Scanner;

public class Bai5_13Letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        String q = scanner.nextLine();
        int k = scanner.nextInt();
        for (int i = k - 1; i >= 0; i--) {
            s = s + q.charAt(i);
        }
        for (int i = q.length() - 1; i >= k; i--) {
            s = s + q.charAt(i);
        }
        System.out.println(s);
    }
}
