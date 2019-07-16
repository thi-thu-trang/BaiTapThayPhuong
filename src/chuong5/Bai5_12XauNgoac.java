package chuong5;

import java.util.Scanner;

public class Bai5_12XauNgoac {
    public static boolean groupCheck(String s) {
        int len;
        do {
            len = s.length();
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        } while (len != s.length());
        return s.length() == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strr = scanner.nextLine();
        System.out.println(groupCheck(strr));
    }

}
