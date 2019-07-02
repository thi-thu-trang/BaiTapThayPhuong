package chuong2;

import java.util.Scanner;

public class Bai2_5SongSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, x4, y4;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();
        x4 = scanner.nextInt();
        y4 = scanner.nextInt();
        if ((Math.abs(x2 - x1) / Math.abs(y2 - y1)) == Math.abs(x4 - x3) / Math.abs(y4 - y3))
            System.out.println("true");
        else
            System.out.println("false");
    }

}
