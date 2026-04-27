package Level1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap4_Level1 {
    public static void main(String[] args) {
//        Viết một hàm đếm số từ trong một chuỗi. Hàm nhận vào 1 chuỗi và trả về số từ trong chuỗi
        Scanner scan = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Hãy nhập vào một chuỗi bất kỳ: ");
            input = scan.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Không được để trống! Vui lòng nhập lại.");
                continue;
            }
            break;
        }
        System.out.println("Chuỗi bạn đã nhập là: " + input);

//        Gọi hàm đếm số lượng từ
        int output = countStr(input);
        System.out.println("Số lượng từ trong chuỗi của bạn: " + output + " từ");
    }

//    Hàm đếm số từ chuỗi
    public static int  countStr (String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        // Tách mảng và trả về độ dài
        String[] inputArr = s.trim().split("\\s+");
        return inputArr.length;
    }

}
