package demo.bai7;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        Scanner sc = new Scanner(System.in);
        // nhap
        while (true) {
            System.out.println("\nNhap nhan vien (1) Nhan vien van phong, (2) Nhan vien san xuat, (0) thoat:");
            int chon = Integer.parseInt(sc.nextLine());

            if (chon == 0) {
                System.out.println("Thoat chuong trinh!");
                break;
            }

            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();

            System.out.print("Nhap ma nhan vien: ");
            int maNV = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap luong: ");
            double luong = Double.parseDouble(sc.nextLine());

            if (chon == 1) {
                NhanVienVP nvVP = new NhanVienVP(hoTen, maNV, luong);
                ds.add(nvVP);

                System.out.println("thuc hien tinh luong: " + nvVP.tinhLuong());
            } else if (chon == 2) {
                NhanVienSX nvSX = new NhanVienSX(hoTen, maNV, luong);
                ds.add(nvSX);

                System.out.println("thuc hien tinh luong: " + nvSX.tinhLuong());

            } else {
                System.out.println("Nhap sai! Vui long nhap lai.");
            }
        }
        // tiem ten nhan vien
        boolean tim = false;
        while (!tim) {
            System.out.println("Nhap ten nhan vien can tim: ");
            String tenTim = sc.nextLine();

            for (NhanVien nv : ds) {
                if (nv.getHoTen().equalsIgnoreCase(tenTim)) {
                    System.out.println("Da tim thay: " + nv);
                    tim = true;
                    break;
                }
            }
            if (!tim) {
                System.out.println("Khong tim thay nhan vien: " + tenTim + " moi nhap lai!");

            }
        }
        // xoa ten nhan vien
        boolean xoa = false;
        while (!xoa) {
            System.out.println("Nhap ten nhan vien can xoa: ");
            String tenXoa = sc.nextLine();
            for (int i = 0; i < ds.size(); i++) {
                if (ds.get(i).getHoTen().equalsIgnoreCase(tenXoa)) {
                    ds.remove(i);
                    System.out.println(" Da xoa nhan vien co ten la " + tenXoa + " thanh cong!");
                    xoa = true;
                    break;
                }
            }
            if (!xoa) {
                System.out.println("Khong tim thay nhan vien: " + tenXoa + " de xoa!");
            }
        }

        // Sua thong tin nhan vien
        System.out.println("Co muon sua thong tin nhan vien khong? (C/K)");
        String chonSua = sc.nextLine();
        if (chonSua.equalsIgnoreCase("C")) {
            boolean sua = false;
            while (!sua) {
                System.out.println("Nhap ten can sua:");
                String tenSua = sc.nextLine();
                for (NhanVien nv : ds) {
                    if (nv.getHoTen().equalsIgnoreCase(tenSua)) {
                        System.out.println("Nhap ten moi: ");
                        String tenMoi = sc.nextLine();
                        nv.setHoTen(tenMoi);

                        System.out.println("Nhap ma nhan vien moi: ");
                        int maNVMoi = Integer.parseInt(sc.nextLine());
                        nv.setMaNV(maNVMoi);

                        System.out.println("Nhap luong moi: ");
                        double luongMoi = Double.parseDouble(sc.nextLine());
                        nv.setLuong(luongMoi);

                        System.out.println("Da sua thong tin nhan vien: " + nv);
                        sua = true;
                        break;
                    }
                }
                if (!sua) {
                    System.out.println("Khong tim thay nhan vien: " + tenSua + " de sua!");
                }
            }
        } else if (chonSua.equalsIgnoreCase("K")) {
            System.out.println("Da chon khong sua thong tin nhan vien!");
        } else {
            System.out.println("Nhap sai! Vui long nhap lai.");
        }
        // dem so luong nhan vien
        int dem = 0;
        for (NhanVien nv : ds) {
            dem++;
        }
        System.out.println("So luong nhan vien trong danh sach: " + dem);
    }
}
