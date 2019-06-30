package chuong2;

import java.util.Scanner;

public class Bai2_12TongChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
        }
        while (n<0);
        int tong=0;
        for(int i=0;i<n;i++)
        {
            int  a= scanner.nextInt();
            if(n%a==0)
                tong+=a;
        }
        System.out.println("tong la:"+tong);
    }
}
