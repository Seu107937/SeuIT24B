package ontap.buoi6;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // NhanVien nv = new NhanVien("tom", 900000);
        // System.out.println(nv);

        // NhanVien tp = new TruongPhong("Sou ", 10000000, 100000000);
        // System.out.println(tp);

        // NhanVien lc = new LaoCong("HIHI", 8000000, 100);
        // System.out.println(lc);

        ArrayList<NhanVien> ds = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // code nhap ds
        while (true) {
            System.out.print("Ban nhap nhan vien (1), truong phong (2) hay lao cong (3) ");
            String chon = sc.nextLine();

            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();

            System.out.print("Nhap luong: ");
            double luong = Double.parseDouble(sc.nextLine());

            if (chon.equalsIgnoreCase("1")) {
                ds.add(new NhanVien(hoTen, luong));

            } else if (chon.equalsIgnoreCase("2")) {
                System.out.print("Nhap trach nhiem: ");
                double trachNhiem = Double.parseDouble(sc.nextLine());
                ds.add(new TruongPhong(hoTen, luong, trachNhiem));

            } else if (chon.equalsIgnoreCase("3")) {
                System.out.print("Nhap so gio lam viec: ");
                double soGioLamViec = Double.parseDouble(sc.nextLine());
                ds.add(new LaoCong(hoTen, luong, soGioLamViec));

            } else {
                System.out.println("Lua chon khong hop le!");
            }

            System.out.print("Ban co nhap tiep khong (C/K)? ");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("K"))
                break;
        }

        // Hiển thị danh sách nhân viên
        System.out.println("\nDanh sach nhan vien:");
        for (NhanVien nv : ds) {
            nv.hienThi();
        }

        // Tìm nhân viên theo tên
        System.out.print("\nNhap ten nha vien can tim: ");
        String tenTim = sc.nextLine();
        boolean found = false;
        for (NhanVien nv : ds) {
            if (nv.getHoTen().equalsIgnoreCase(tenTim)) {
                nv.hienThi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nhan vien co ten: " + tenTim);
        }
    }
}
