package Level1;

import java.util.Scanner;

public class BaiTap3_Level1 {
    public static void main(String[] args) {
//        Viết một hàm tính tổng các số chẵn từ 0 đến một số nguyên dương n cho trước
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scan.nextInt();

        // Gọi hàm tính tổng và in kết quả
        int result = sumEvenNumbers(n);
        System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + result);

        scan.close();
    }

    // HÀM tính tổng các số chẵn
    public static int sumEvenNumbers(int n) {
        int sum = 0;

        // Duyệt từ 0 đến n
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}