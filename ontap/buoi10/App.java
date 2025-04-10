package ontap.buoi10;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static ArrayList<NguoiLaoDong> ds = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhap thong tin nguoi lao dong
        while (true) {

            System.out.println("\nChon loai nguoi lao dong: (1) Nhan Vien, (2) Tap Vu, (3) QuanLy (0) Thoat: ");
            String chon = sc.nextLine();

            if (chon.equalsIgnoreCase("0")) {
                System.out.println("Ket thuc chuong trinh!");
                break;
            }

            System.out.println("Nhap ho va ten: ");
            String hoTen = sc.nextLine();

            System.out.println("Nhap luong co ban: ");
            double luongCB = Double.parseDouble(sc.nextLine());

            if (chon.equalsIgnoreCase("1")) {
                System.out.println("Nhap thu nhap: ");
                double thuNhap = Double.parseDouble(sc.nextLine());
                ds.add(new NhanVien(hoTen, luongCB, thuNhap));

                System.out.println(hoTen + " co thu nhap la: " + (thuNhap + luongCB));

            } else if (chon.equalsIgnoreCase("2")) {
                System.out.println("Nhap so gio lam viec: ");

                int soGioLamViec = Integer.parseInt(sc.nextLine());
                ds.add(new TapVu(hoTen, luongCB, soGioLamViec));

                System.out.println(hoTen + " co thu nhap la: " + (luongCB * soGioLamViec));
            } else if (chon.equalsIgnoreCase("3")) {
                System.out.println("Nhap phu cap: ");

                double phuCap = Double.parseDouble(sc.nextLine());
                ds.add(new QuanLy(hoTen, luongCB, phuCap));

                System.out.println(hoTen + " co thu nhap la: " + (luongCB + phuCap));
            } else {
                System.out.println("Lua chon khong hop le, vui long chon lai!");
            }
        }
        // tim kiem theo ten nguoi lao dong
        while (true) {
            System.out.println("Ban co muon tim kiem nguoi lao dong theo ten khong? (C/K): ");
            String tiepTuc = sc.nextLine();

            if (tiepTuc.equalsIgnoreCase("C")) {
                System.out.println("Nhap ten nguoi lao dong can tim: ");
                String tenCanTim = sc.nextLine();

                boolean found = false;

                for (NguoiLaoDong nld : ds) {
                    if (nld.getHoTen().equalsIgnoreCase(tenCanTim)) {
                        System.out.println(nld.toString());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("\nKhong tim thay nguoi lao dong co ten: " + tenCanTim);
                }
            } else if (tiepTuc.equalsIgnoreCase("K")) {
                System.out.println("Ket thuc chuong trinh!");
                break;
            } else {
                System.out.println("Lua chon khong hop le, vui long chon lai!");
            }

        }
        // Xoa nguoi lao dong
        System.out.println("nhap ten nguoi lao dong can xoa: ");
        String tenCanXoa = sc.nextLine();
        boolean xoa = false;
        for (int i = 0; i < ds.size(); i++) {
            NguoiLaoDong nld = ds.get(i);

            if (nld.getHoTen().equalsIgnoreCase(tenCanXoa)) {
                ds.remove(i);
                xoa = true;
                System.out.println("Da xoa nguoi lao dong co ten: " + tenCanXoa);
                break;
            }
        }
        if (!xoa) {
            System.out.println("khong tim thay nguoi lao dong can xoa: " + tenCanXoa);
        }
        // sua nguoi lao dong
        System.out.println("Nhap ten can sua:");
        String tenCanSua = sc.nextLine();
        boolean sua = false;

        for (NguoiLaoDong snld : ds) {
            if (snld.getHoTen().equalsIgnoreCase(tenCanSua)) {
                System.out.println("Nhap ten moi: ");
                String tenMoi = sc.nextLine();
                snld.setHoTen(tenMoi);
                System.out.println("Da sua ten nguoi lao dong thanh cong!");
                sua = true;
                break;
            }
        }
        // đem so luong lao dong
        System.out.println("So luong nguoi lao dong trong danh sach: " + ds.size());

    }
}