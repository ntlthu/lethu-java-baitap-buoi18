package Level1;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // ===== BƯỚC 1: nhập số phần tử (có validate) =====
        int input;
        while (true) {
            System.out.print("Bạn muốn tạo một mảng số nguyên gồm bao nhiêu phần tử? Hãy nhập 1 số cụ thể: ");
            String line = scan.nextLine();

            if (line.trim().isEmpty()) {
                System.out.println("Không được để trống!");
                continue;
            }

            try {
                input = Integer.parseInt(line);
                if (input <= 0) {
                    System.out.println("Phải nhập số > 0!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phải nhập số nguyên!");
            }
        }

        int[] inputArr = new int[input];

        // ===== BƯỚC 2: nhập từng phần tử của mảng =====
        System.out.println("Hãy gán giá trị cụ thể cho mảng của bạn: ");
        for (int i = 0; i < input; i++) {
            while (true) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                String line = scan.nextLine();

                if (line.trim().isEmpty()) {
                    System.out.println("Không được để trống!");
                    continue;
                }

                try {
                    inputArr[i] = Integer.parseInt(line);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Phải nhập số nguyên!");
                }
            }
        }

        // ===== BƯỚC 3: in mảng =====
        System.out.print("Mảng bạn đã nhập: ");
        for (int i = 0; i < input; i++) {
            System.out.print(inputArr[i] + ", ");
        }

        // ===== BƯỚC 4: tìm số lớn thứ 2 =====
        int result = findSecondMax(inputArr);
        System.out.println();
        System.out.println("Giá trị lớn thứ hai là: " +
                (result == Integer.MIN_VALUE ? "Không tồn tại" : result));

        scan.close();
    }

    // ===== HÀM tìm giá trị lớn thứ 2 =====
    public static int findSecondMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (x > max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax && x != max) {
                secondMax = x;
            }
        }

        return secondMax;
    }
}