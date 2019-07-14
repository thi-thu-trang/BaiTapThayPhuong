package chuong5;

import java.util.HashMap;
import java.util.Scanner;

public class Bai5_5ThongKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        HashMap<Character, Integer> vitri = new HashMap<>();
        char[] mang = chuoi.toCharArray();
        for (char k : mang) {
            if (Character.isAlphabetic(k)) {
                if (vitri.containsKey(k)) {
                    vitri.put(k, vitri.get(k) + 1);
                } else {
                    vitri.put(k, 1);
                }
            }

        }
        System.out.println(vitri);


    }
}
