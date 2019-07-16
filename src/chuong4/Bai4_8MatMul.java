package chuong4;

import java.util.Scanner;

public class Bai4_8MatMul {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m, n, k;
        int[][] a, b, c;
        System.out.println("Nhap cap ma tran a: ");
        m = scn.nextInt();
        n = scn.nextInt();
        System.out.println("Nhap so cot ma tran b: ");
        k = scn.nextInt();
        System.out.println("Nhap ma tran a: ");
        a = nhap(m, n, scn);
        System.out.println("Nhap ma tran b: ");
        b = nhap(n, k, scn);
        System.out.println("Ket qua: ");
        c = TichMaTran(a, b);
        Xuat(c);
    }

    private static int[][] nhap(int m, int n, Scanner scn) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = scn.nextInt();
            }
        }
        return x;
    }

    private static void Xuat(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%5d", x[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] TichMaTran(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return c;
    }
}


