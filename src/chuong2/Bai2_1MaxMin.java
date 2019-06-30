package chuong2;

import java.util.Scanner;

public class Bai2_1MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, solon;
        //phai import thu vien

       //system.out.println(a +b +c +d); e phai tao 1 bien de luu r ms in // in the la nhu c++
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        solon = a;
        if(solon < b) solon=b;
        if(solon < c) solon=c;
        if(solon < d) solon=d;
        System.out.println("so lon nhat:"+solon);

    }

}
