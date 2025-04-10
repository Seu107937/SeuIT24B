package demo.bai9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<GiaoDich> dg = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // nhap
        while (true) {
            System.out.println("\nMoi chon giao dich: (1): Tien mat, (2): Chuyen khoan, (3): The tin dung, (0): Thoat");
            int chon = Integer.parseInt(sc.nextLine());

            if (chon == 0) {
                System.out.println("Thoat chuong trinh  !!");
                break;
            } else if (chon < 1 || chon > 3) {
                System.out.println("Khong hop le !!");
                continue;
            }

            System.out.println("Nhap ma giao dich bang chu: ");
            String maGiaoDich = sc.nextLine();

            // ngay nhap tu ban phim
            System.out.println("Nhap ngay giao dich (nam-thang-ngay): ");
            String ngayGD = sc.nextLine();
            LocalDate ngayGiaoDich = LocalDate.parse(ngayGD);

            /*
             * tu lay ngay hien tai
             * LocalDate ngayGiaoDich = LocalDate.now();
             * System.out.println("Ngay giao dich: " + ngayGiaoDich);
             */

            System.out.println("Nhap gia don bang so: ");
            double giadon = Double.parseDouble(sc.nextLine());

            if (chon == 1) {
                System.out.println("Nhap tien mat: ");
                double tienMat = Double.parseDouble(sc.nextLine());

                GiaoDichTienMat dgtm = new GiaoDichTienMat(maGiaoDich, ngayGiaoDich, giadon, tienMat);
                dg.add(dgtm);
                System.out.println(dgtm);
            } else if (chon == 2) {
                System.out.println("Nhap so tien chuyen khoan: ");
                double chuyenKhoan = Double.parseDouble(sc.nextLine());

                GiaoDichChuyenKhoan dgck = new GiaoDichChuyenKhoan(maGiaoDich, ngayGiaoDich, giadon, chuyenKhoan);
                dg.add(dgck);
                System.out.println(dgck);

            } else if (chon == 3) {
                System.out.println("Nhap so tien bang the tin dung: ");
                double theTinDung = Double.parseDouble(sc.nextLine());

                GiaoDichTheTinDung gdttd = new GiaoDichTheTinDung(maGiaoDich, ngayGiaoDich, giadon, theTinDung);
                dg.add(gdttd);
                System.out.println(gdttd);
            } else {
                System.out.println("Lua chon khong hop le, vui long chon lai!");
            }
        }

    }

}
