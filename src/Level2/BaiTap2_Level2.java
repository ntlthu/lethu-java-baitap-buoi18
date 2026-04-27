package Level2;

import java.util.Scanner;

public class BaiTap2_Level2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập vào 1 chuỗi: ");
        String input = scan.nextLine();

        boolean result = isPalindrome(input);

        System.out.println("Kết quả: " + result);
    }

    // Hàm kiểm tra đối xứng
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}