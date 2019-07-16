package chuong5;

import java.util.Scanner;

public class Bai5_18PalinCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int start = 0;
        int end = str.length() - 1;
        boolean Pal = true;
        while (start < end) {
            String startLetter = str.substring(start, start + 1);
            String endLetter = str.substring(end, end + 1);
            //char startLetter = str.charAt(start);
            //char endLetter = str.charAt(end);
            if (startLetter.equals(endLetter) == false)
                if (startLetter != endLetter) {
                    Pal = false;
                    break;
                }
            start++;
            end--;
        }
        if (Pal == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


