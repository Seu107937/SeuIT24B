package ontap.buoi2;

import java.util.ArrayList;
import java.util.Scanner;

public class tongSoThuc {
    static ArrayList<Double> a = new ArrayList<>();

    public static void main(String[] args) {
        nhap();
        in();
        tong();
    }

    private static void in() {
        System.out.println("Danh sách các số đã nhập:");
        for (Double so : a) {
            System.out.println(so);
        }

    }

    private static void tong() {
        double tong = 0;
        for (Double so : a) {
            tong += so;
        }
        System.out.println("Tổng các số đã nhập: " + tong);
    }

    private static void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("nhập số(enter = kết thúc):");
                String s = sc.nextLine();

                if (s.isEmpty())
                    break;
                double n = Double.parseDouble(s);
                a.add(n);
            } catch (Exception e) {
                System.out.println("bạn nhập dữ liệu không đúng, hãy nhập lại ");
                continue;
            }

        }
    }

}
