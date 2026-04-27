package Level3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiTap3_Level3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi s: ");
        String s = sc.nextLine();

        System.out.print("Nhập chuỗi t: ");
        String t = sc.nextLine();

        String result = minWindow(s, t);

        System.out.println("Kết quả: " + result);
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();

        // đếm ký tự của t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, count = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);

                if (map.get(c) >= 0) {
                    count++;
                }
            }

            // khi đủ ký tự
            while (count == t.length()) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}