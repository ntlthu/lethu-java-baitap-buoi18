package Level2;

import java.util.Scanner;

public class BaiTap3_Level2 {
    public static void main(String[] args) {
//        Đề bài: Viết một hàm xóa các ký tự lặp lại trong chuỗi (hàm nhận vào một chuỗi và trả về chuỗi mới không chứa ký tự lặp lại)
//        Bước 1: Kêu người dùng nhập vào một chuỗi bất kỳ
        System.out.println("Hãy nhập vào một chuỗi bất kỳ: ");
//        Bước 2: Get chuỗi người dùng nhập vào
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Chuỗi bạn đã nhập: " + input);
//        Bước 3: In ra chuỗi đã xóa các ký tự trùng lặp
        String output = removeDuplicateChars(input);
        System.out.println("Chuỗi đã xóa các ký tự trùng lặp: " +output);

    }

//    HÀM xóa các ký tự lặp lại trong chuỗi
    public static String removeDuplicateChars (String c) {
//        Khởi tạo một chuỗi rỗng để chứa kết quả
        String result = "";

//        Xử lý
        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);
            //        Kiểm tra xem charI có bị trùng với ký tự nào trong chuỗi input không
            if (!result.contains("" + ch)) {
                // Nếu chưa tồn tại, cộng ký tự này vào chuỗi result
                result += ch;
            }
        }

        return result;
    }
}
