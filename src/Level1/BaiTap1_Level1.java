package Level1;

import java.util.Scanner;

public class BaiTap1_Level1 {
    public static void main(String[] args) {
//        Đề bài:
        System.out.println("Hãy nhập vào 1 chuỗi bất kỳ: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Chuỗi bạn đã nhập là: " + input);
        String output = removeVowel(input);
        System.out.println("Chuỗi sau khi đã xóa nguyên âm a, e, i, o, u là: " + output);

        scan.close();
    }
//    Hàm xóa tất cả các nguyên âm: a, e, i, o, u
    public static String removeVowel (String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char lowerC = Character.toLowerCase(c);
            switch (lowerC) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default:
                    result += c;
                    break;
            }
        }
        
        return result;
    }

}
