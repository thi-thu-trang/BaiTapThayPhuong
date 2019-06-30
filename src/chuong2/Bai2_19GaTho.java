package chuong2;

import java.util.Scanner;

public class Bai2_19GaTho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        m = scanner.nextInt();
        n = scanner.nextInt();
        for (int x = 1; x <= m; x++)//chan ga
        {
            for (int y = 1; y <= m; y++)//chan tho
                if (x * 2 + y * 4 == n && x + y == m) {
                    System.out.println("ga=:" + x);
                    System.out.println("tho=:" + y);

                } else
                    System.out.println("-1");
        }


    }
}
