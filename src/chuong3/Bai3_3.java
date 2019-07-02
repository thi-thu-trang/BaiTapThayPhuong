package chuong3;

public class Bai3_3 {
    public static void main(String[] args) {
        String str = "C";
        System.out.println("chu cai thuong la: " + str);
        Lower(str);
    }

    public static String Lower(String str) {
        String strLower = str.toLowerCase();
        System.out.println("chuw cais hoa la: " + strLower);
        return strLower;
    }
}


