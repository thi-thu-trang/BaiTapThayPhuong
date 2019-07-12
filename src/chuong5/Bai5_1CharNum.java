import java.util.Scanner;

public class Bai5_1CharNum {
    public static void main(String[] args) {
        String chuoi;
        int dem = 0;
        Scanner scanner = new Scanner(System.in);
        chuoi = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {

            if (Character.isDigit(chuoi.charAt(i))) {
                dem++;
            }
        }
        System.out.println(dem);
    }
}




