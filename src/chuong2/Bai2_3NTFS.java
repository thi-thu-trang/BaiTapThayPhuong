package chuong2;

import java.util.Scanner;

public class Bai2_3NTFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kichThuoc = scanner.nextInt();
        if (kichThuoc % 4096 == 0)
            System.out.printf("File chiem %dKb.", (kichThuoc / 4096) * 4);
        else
            System.out.printf("File chiem %dKb.", (kichThuoc / 4096 + 1) * 4);
    }
}

