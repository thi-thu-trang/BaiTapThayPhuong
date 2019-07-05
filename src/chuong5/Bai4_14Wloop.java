package chuong5;

import java.util.Scanner;

public class Bai4_14Wloop {
    public static boolean test(String str) {
        int size = str.length();
        for (int i = 1; i < size / 2; i++) {
            if (size % i == 0) {
                int len = 0, dem = 0;
                String sb = str.substring(len, len + i);
                for (; len < size; len = len + i) {
                    String str1 = str.substring(len, len + 1);
                    if (str1.equals(sb)) {
                        dem++;
                    }
                    str1 = "";
                }
                if (dem == size / i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(test(str));
    }
}
