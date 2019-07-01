package chuong4;

import java.util.ArrayList;
import java.util.Scanner;


/*
private static int mang(ArrayList<Integer> day) {
    String max = " ";
    for (int i = 0; i < day.size(); i++) {
        int dem = 1;
       for(int j = 0;j<day.size();j++) {
            if (day.get(j) < day.get(i)) {
               // F1[i] = max( F[i],F[j]+1)

            } else {
                i++;
            }

        }
        System.out.println(dem);

    }return 0;
}
    public static void main (String[]args){
        ArrayList<Integer> day = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            day.add(number);
        }
        mang(day);
        System.out.println(day);

    }

 */
public class Bai4_6DayTang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, num;
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Nhap so phan tu cua mang: ");
        n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            num = scn.nextInt();
            a.add(num);
        }
        int max = 0;
        int[] b = new int[100];

        for (int i = 0; i < n; i++) {
            b[i] = 1;
            // int b = 1;
            for (int j = i; j < n - 1; j++) {
                if (a.get(j) <= a.get(j + 1)) {
                    b[i]++;
                    //b++;
                }
                if (a.get(j) > a.get(j + 1)) {
                    break;
                }
            }
            if (b[i] > max) max = b[i];
            //if (b > max) max = b;
        }
        System.out.println("Do dai day con tang dan nhieu nhat: " + max);
    }
}
