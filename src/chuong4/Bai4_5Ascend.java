package chuong4;

import java.util.ArrayList;
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
        Check(mangtang);
        System.out.println(Check(mangtang));


    }

    private static boolean Check(ArrayList<Integer> mangtang) {
        for (int i = 0; i < mangtang.size(); i++) {
            if (mangtang.get(i) < mangtang.get(i + 1)) {
                return true;
            } else return false;
        }
        return false;
    }
}

