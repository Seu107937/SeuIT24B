package ontap.buoi1;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập tuổi: ");
            int tuoi = Integer.parseInt(sc.nextLine());

            System.out.print("Nhập họ tên: ");
            String hoTen = sc.nextLine();

            System.out.print(tuoi + " tuổi là tuổi của " + hoTen + " năm nay ");
        } catch (Exception e) {

            System.out.print("ban nhap sai vui long nhap lai!!");

        }
    }
}