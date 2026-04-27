package Level3;

import java.util.Scanner;

public class BaiTap1_Level3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Nhập số phần tử =====
        System.out.print("Nhập số phần tử của mảng muốn tạo: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // ===== Nhập mảng (đã sort tăng dần) =====
        System.out.println("Hãy gán giá trị tăng dần cho mảng:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // ===== Nhập target =====
        System.out.print("Nhập số target: ");
        int target = sc.nextInt();

        // ===== Gọi hàm =====
        int[] result = twoSum(numbers, target);

        // ===== In kết quả =====
        if (result[0] == -1) {
            System.out.println("Không tìm thấy cặp số phù hợp.");
        } else {
            System.out.println("Kết quả: [" + result[0] + ", " + result[1] + "]");
        }
        sc.close();
    }

    // ===== Two Pointers =====
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // vì index bắt đầu từ 1
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}