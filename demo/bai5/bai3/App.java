package demo.bai5.bai3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<thongTin> quanLyThongTin = new ArrayList<>();
        System.out.println("\nNhap so nhan vien: ");
        int soNhanVien = sc.nextInt();

        for (int i = 0; i < soNhanVien; i++) {

            System.out.println("\nNhập thông tin cho nhan vien: ");
            int thongTin = sc.nextInt();

            System.out.println("\nnhap ho ten: ");
            String hoTen = sc.nextLine();

            System.out.println("\n nhap tuoi: ");
            int tuoi = Integer.parseInt(sc.nextLine());

            System.out.println("\nnhap que: ");
            String que = sc.nextLine();

            System.out.println("\nnhap luong: ");
            double luong = Double.parseDouble(sc.nextLine());
        }

    }
}
