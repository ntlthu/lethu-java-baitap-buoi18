package Level1;

import java.util.Scanner;

public class BaiTap5_Level1 {
    public static void main(String[] args) {
//   Viết một hàm in ra chữ cái đầu tiên của mỗi từ trong một chuỗi.
        Scanner scan = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Hãy nhập vào một chuỗi bất kỳ: ");
            input = scan.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Không được để trống! Vui lòng nhập lại.");
                continue;
            }
            break;
        }
//   Gọi hàm
        String output = getFirstLetter(input);
        System.out.println("Các chữ cái đầu của mỗi từ bạn đã nhập: " + output);

    }

//    Hàm in ra chữ cái đầu tiên của mỗi từ trong một chuỗi
    public static String getFirstLetter (String s) {
        String [] stringSplit = s.trim().split("\\s+");
        String result = "";

        for (String c : stringSplit) {
            if (!c.isEmpty()) {
                result += Character.toUpperCase(c.charAt(0)) + " ";
            }
        }
        return result.trim();
    }

}
