import java.util.Scanner;

public class Bai5_3WordList {
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        chuoi = scanner.nextLine();
        String[] Kytu = chuoi.split(" ");
        //cho nao co khoang trong thì cat ra
        for (String k : Kytu) {
            System.out.println(k);
        }
    }

}



