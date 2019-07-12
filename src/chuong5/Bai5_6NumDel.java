import java.util.Scanner;

public class Bai5_6NumDel {
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        chuoi = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isAlphabetic(chuoi.charAt(i))) {
                System.out.print(chuoi.charAt(i));
            }

        }

    }
}

