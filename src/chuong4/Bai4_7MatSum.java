package chuong4;

import java.util.Scanner;

public class Bai4_7MatSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m, n;
        do {
            System.out.println("nhap vao so dong cua ma tran:");
            m = scn.nextInt();
            System.out.println("nhap cot:");
            n = scn.nextInt();
        } while (m < 1 || n < 1);
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];
        System.out.println("nhap ma tran a");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("a[" + i + "," + j + "]=");
                a[i][j] = scn.nextInt();
            }
        }
        System.out.println("nhap ma tran b");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("b[" + i + "," + j + "]=");
                b[i][j] = scn.nextInt();
            }
        }
        System.out.println("ma tran a");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Ma tran B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Ma trận tổng C:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
