package demo.Buoi6.Buoi6;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<NguoiLaoDong> ds = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhap
        while (true) {
            System.out.println("nhap quan ly(1), tap vu(2), nhan vien(3), thoat(0)");
            String chon = sc.nextLine();

            if (chon.equalsIgnoreCase("0")) {
                System.out.println("thoat chuong trinh !!!");
                break;
            }

            System.out.print("nhap ho ten ");
            String hoTen = sc.nextLine();

            System.out.print("nhap luong co ban ");
            double luongCB = Double.parseDouble(sc.nextLine());

            if (chon.equalsIgnoreCase("1")) {
                System.out.println("nhap phu cap ");
                double phuCap = Double.parseDouble(sc.nextLine());

                QuanLy ql = new QuanLy(hoTen, luongCB, phuCap);
                ds.add(ql);
            } else if (chon.equalsIgnoreCase("2")) {
                System.out.println("nhap so gio lam viec ");
                double soGioLamViec = Double.parseDouble(sc.nextLine());

                TapVu tv = new TapVu(hoTen, luongCB, soGioLamViec);
                ds.add(tv);
            } else if (chon.equalsIgnoreCase("3")) {
                NhanVien nv = new NhanVien(hoTen, luongCB);
                ds.add(nv);
            } else {
                System.out.println("nhap sai vui long nhap lai!!!");
            }
        }
        System.out.println("---------------------------------------------------------");
        // tim kiem theo ho ten
        System.out.println("nhap ho ten nguoi muon tim ");
        String timNguoi = sc.nextLine();
        boolean tim = false;

        for (NguoiLaoDong ct : ds) {
            if (ct.getHoTen().equalsIgnoreCase(timNguoi)) {
                System.out.println(ct);
                tim = true;
                break;
            }
            if (!tim) {
                System.out.println("khong tim thay du lieu!!!");
            }
        }
        System.out.println("---------------------------------------------------------");
        // xoa nguoi lao dong
        System.out.println("nhap ten nguoi muon xoa ");
        String xoaNLD = sc.nextLine();
        boolean xoa = false;

        for (int i = 0; i < ds.size(); i++) {
            NguoiLaoDong x = ds.get(i);
            if (x.getHoTen().equalsIgnoreCase(xoaNLD)) {
                ds.remove(i);
                xoa = true;
                break;
            }
        }
        if (xoa) {
            System.out.println("da xoa nguoi lao dong ten " + xoaNLD);
        } else {
            System.out.println("khong tim thay nguoi can xoa ten " + xoaNLD);
        }
        System.out.println("---------------------------------------------------------");
        // sua thong tin dua theo ten
        System.out.println("nhap ten nguoi lao dong can sua ");
        String suaNLD = sc.nextLine();
        boolean sua = false;

        for (NguoiLaoDong snld : ds) {
            if (snld.getHoTen().equalsIgnoreCase(suaNLD)) {
                System.out.println("nhap thong tin moi: ");

                System.out.print("nhap luong co ban moi: ");
                double luongMoi = Double.parseDouble(sc.nextLine());
                snld.setLuongCB(luongMoi);

                if (snld instanceof QuanLy) {
                    System.out.print("nhap phu cap moi: ");
                    double phuCapMoi = Double.parseDouble(sc.nextLine());
                    ((QuanLy) snld).setPhuCap(phuCapMoi);
                }
                if (snld instanceof TapVu) {
                    System.out.print("nhap so gio lam viec moi: ");
                    double soGioLamViecMoi = Double.parseDouble(sc.nextLine());
                    ((TapVu) snld).setsoGioLamViec(soGioLamViecMoi);
                }

                System.out.println("thong tin nguoi lao dong da duoc sua ");
                sua = true;
                break;
            }
        }
        System.out.println("---------------------------------------------------------");
        // dem so nguoi lao dong
        System.out.println("Danh sach nguoi lao dong:");
        for (NguoiLaoDong nld : ds) {
            System.out.println(nld);
        }
        System.out.println("so nguoi lao dong: " + ds.size());

        System.out.println("---------------------------------------------------------");

        sc.close();
    }
}
