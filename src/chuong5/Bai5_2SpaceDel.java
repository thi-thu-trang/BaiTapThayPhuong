import java.util.Scanner;

public class Bai5_2SpaceDel {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        String result;
        result = str.trim();
        while (result.indexOf("  ") != -1) {
            // tìm kiếm một phần tử trong mảng dựa vào phần tử
            //hàm sẽ trả về vị trí của phần tử nếu tìm thấy
            //trả về -1 nếu kh tìm thấy
            result = result.replaceAll("  ", " ");
        }
        System.out.println(result);
    }
}
