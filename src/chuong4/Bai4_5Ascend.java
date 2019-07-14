package chuong4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai4_5Ascend {

    public static void main(String[] args) {

        ArrayList<Integer> mangtang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            mangtang.add(number);
        }
        for (int k = 0; k < mangtang.size(); k++) {
            if (mangtang.get(k) < mangtang.get(k + 1)) {
                System.out.println("true");
            } else System.out.println("false");
        }


    }
}

