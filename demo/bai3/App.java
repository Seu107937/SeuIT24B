package demo.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();
        System.out.print("Nhap so luong chuyen xe: ");
        int soLuong = sc.nextInt();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin chuyen xe thu " + (i + 1) + ": ");
            System.out.print("Nhap ma so chuyen: ");
            int maSoChuyen = sc.nextInt();
            sc.nextLine(); // Đọc dòng còn lại
            System.out.print("Nhap ho ten tai xe: ");

            String hoTenTaiXe = sc.nextLine();
            System.out.print("Nhap so xe: ");
            int soXe = sc.nextInt();
            System.out.print("Nhap doanh thu: ");
            double doanhThu = sc.nextDouble();
            System.out.print("Nhap loai chuyen xe (1: Noi thanh, 2: Ngoai thanh): ");
            int loaiChuyenXe = sc.nextInt();

            if (loaiChuyenXe == 1) {
                System.out.print("Nhap so tuyen: ");
                int soTuyen = sc.nextInt();
                System.out.print("Nhap so km di duoc: ");
                int soKmDiDuoc = sc.nextInt();
                XeNoiThanh xeNoiThanh = new XeNoiThanh(maSoChuyen, hoTenTaiXe, soXe, doanhThu, soTuyen,
                        soKmDiDuoc);
                dsChuyenXe.add(xeNoiThanh);
            } else if (loaiChuyenXe == 2) {
                sc.nextLine(); // Đọc dòng còn lại
                System.out.print("Nhap noi den: ");
                String noiDen = sc.nextLine();
                System.out.print("Nhap so ngay di: ");
                int soNgayDi = sc.nextInt();
                XeNgoaiThanh xeNgoaiThanh = new XeNgoaiThanh(maSoChuyen, hoTenTaiXe, soXe, doanhThu, noiDen, soNgayDi);
                dsChuyenXe.add(xeNgoaiThanh);
            } else {
                System.out.println("Loai chuyen xe khong hop le!");
            }

        }

    }
}
