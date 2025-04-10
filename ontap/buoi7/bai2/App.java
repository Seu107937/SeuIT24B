package ontap.buoi7.bai2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // NguoiLaoDong ld = new NguoiLaoDong("See", 2000000);
        // System.out.println(ld);

        // Quanly ql = new Quanly("Sii", 2000000, 1000000);
        // System.out.println(ql);

        // TapVu tv = new TapVu("Kaka", 40);
        // System.out.println(tv);

        // NhanVien nv = new NhanVien("hehe", 2000000, 30000);
        // System.out.println(nv);

        Scanner sc = new Scanner(System.in);
        ArrayList<NguoiLaoDong> DSNguoiLaoDong = new ArrayList<>();

        System.out.println("\nnhap so nguoi lao dong: ");
        int soLuong = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap ho va ten: ");
            String hoTen = sc.nextLine();

            System.out.println("Luong Co ban: ");
            double luongCB = sc.nextDouble();
            sc.nextLine();

            NguoiLaoDong nguoiLaoDong = new NguoiLaoDong(hoTen, luongCB);
            DSNguoiLaoDong.add(nguoiLaoDong);

        }
        for (NguoiLaoDong nguoiLaoDong : DSNguoiLaoDong) {
            System.out.println(nguoiLaoDong);
        }
        // Them chuc nang tim kiem vong lap while
        ArrayList<NguoiLaoDong> ketQuaTimKiem = new ArrayList<>();
        while (ketQuaTimKiem.isEmpty()) {
            System.out.println("\nNhap ten nhan vien can tim: ");
            String tenTimKiem = sc.nextLine();
            ketQuaTimKiem = timNhanVien(DSNguoiLaoDong, tenTimKiem);

            if (ketQuaTimKiem.isEmpty()) {
                System.out.println("Khong tim thay nhan vien nao. Vui long nhap lai.");
            }
        }

        System.out.println("Danh sach nhan vien tim thay:");
        for (NguoiLaoDong nv : ketQuaTimKiem) {
            System.out.println(nv);
        }
    }

    public static ArrayList<NguoiLaoDong> timNhanVien(ArrayList<NguoiLaoDong> danhSach, String ten) {
        ArrayList<NguoiLaoDong> ketQua = new ArrayList<>();
        for (NguoiLaoDong nv : danhSach) {
            if (nv.getHoTen().toLowerCase().contains(ten.toLowerCase())) {
                ketQua.add(nv);
            }
        }
        return ketQua;
    }
}
