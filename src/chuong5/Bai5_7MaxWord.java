package chuong5;

import java.util.Scanner;

public class Bai5_7MaxWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        int max = 0;
        String[] tu = chuoi.split(" ");
        for (int k = 0; k < tu.length; k++) {
            int word = tu[k].length();
            if (word > max) {
                max = word;
            }
        }
        System.out.println(max);
    }
}

