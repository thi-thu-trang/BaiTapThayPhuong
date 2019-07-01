package chuong2;

import java.util.Scanner;

public class Bai2_2Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        int datemax = 0;
        if (true) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    datemax = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    datemax = 30;
                    break;
                case 2:
                    if (year % 100 != 0 && year % 4 == 0)
                        datemax = 29;
                    else
                        datemax = 28;
                    break;
            }
        }
        if (date > 0 && date <= datemax && month > 0 && month <= 12) {
            if (date == 31 && month == 12) {
                date = 1;
                month = 1;
                year++;
            }
            if (date == datemax) {
                date = 1;
                month++;
            } else
                date++;
        } else System.out.println("nhap sai vui long nhap lai");

        System.out.printf("hom sau la:ngay:%d ,thang:%d ,nam:%d ", date, month, year);

    }

}


