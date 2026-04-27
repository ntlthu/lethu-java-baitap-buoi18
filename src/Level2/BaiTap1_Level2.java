package Level2;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class BaiTap1_Level2 {

    // ===== HẰNG SỐ THUẾ =====
    static final double RATE_5  = 0.05;
    static final double RATE_10 = 0.10;
    static final double RATE_15 = 0.15;
    static final double RATE_20 = 0.20;
    static final double RATE_25 = 0.25;
    static final double RATE_30 = 0.30;
    static final double RATE_35 = 0.35;

    // ===== NGƯỠNG THU NHẬP (triệu) =====
    static final double LEVEL_1 = 5;
    static final double LEVEL_2 = 10;
    static final double LEVEL_3 = 18;
    static final double LEVEL_4 = 32;
    static final double LEVEL_5 = 52;
    static final double LEVEL_6 = 80;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập vào thu nhập của bạn (VND): ");
        double income = scan.nextDouble();

        // 👉 Đổi từ VND → triệu để tính
        double incomeInMillion = income / 1_000_000;

        double tax = calculateTax(incomeInMillion);

        // 👉 Đổi từ triệu → VND để hiển thị
        double taxVND = tax * 1_000_000;

        // ===== FORMAT TIỀN =====
        NumberFormat formatter = NumberFormat.getInstance(Locale.US);

        System.out.println("Thuế phải nộp: " + formatter.format(taxVND) + " VND");

        scan.close();
    }

    // ===== HÀM TÍNH THUẾ =====
    public static double calculateTax(double income) {
        double tax = 0;

        if (income > LEVEL_6) {
            tax += (income - LEVEL_6) * RATE_35;
            income = LEVEL_6;
        }
        if (income > LEVEL_5) {
            tax += (income - LEVEL_5) * RATE_30;
            income = LEVEL_5;
        }
        if (income > LEVEL_4) {
            tax += (income - LEVEL_4) * RATE_25;
            income = LEVEL_4;
        }
        if (income > LEVEL_3) {
            tax += (income - LEVEL_3) * RATE_20;
            income = LEVEL_3;
        }
        if (income > LEVEL_2) {
            tax += (income - LEVEL_2) * RATE_15;
            income = LEVEL_2;
        }
        if (income > LEVEL_1) {
            tax += (income - LEVEL_1) * RATE_10;
            income = LEVEL_1;
        }
        if (income > 0) {
            tax += income * RATE_5;
        }

        return tax;
    }
}