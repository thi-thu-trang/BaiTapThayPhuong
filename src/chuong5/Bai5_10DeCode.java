package chuong5;

import java.util.Scanner;

public class Bai5_10DeCode {
    public static String Test(String st) {
        String stl = "";
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) >= '0' && st.charAt(i) <= '9') {
                for (int j = 0; j < (int) st.charAt(i) - 48; j++)
                    stl = stl + st.charAt(i + 1);
                i++;
            } else
                stl = stl + st.charAt(i);
        }
        return stl;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println(Test(str1));
    }
}

