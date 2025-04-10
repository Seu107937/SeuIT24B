package ontap.buoi11;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Thuoc> thuoc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // nhap
        while (true) {
            System.out.println("\nMoi chon thuoc: (1): ThuocND, (2): ThuocNK, (0): Thoat ");
            int chon = Integer.parseInt(sc.nextLine());

            if (chon == 0) {
                System.out.println("Thoat chuong trinh!!");
                break;
            } else if (chon < 1 || chon > 2) {
                System.out.println("Khong hop le!!! ");
                continue;

            }

            System.out.println("Nhap ma thuoc: ");
            String ma = sc.nextLine();

            System.out.println("Nhap ten thuoc: ");
            String tenThuoc = sc.nextLine();

            System.out.println("Don gia co ban: ");
            int donGiaCB = Integer.parseInt(sc.nextLine());

            if (chon == 1) {
                System.out.println("Nhap gia bao quan: ");
                int giaBaoQuan = Integer.parseInt(sc.nextLine());

                System.out.println("Nhap gia van chuyen: ");
                int giaVanChuyen = Integer.parseInt(sc.nextLine());

                ThuocND TND = new ThuocND(ma, tenThuoc, donGiaCB, giaBaoQuan, giaVanChuyen);
                thuoc.add(TND);
                System.out.println(TND);
            } else if (chon == 2) {
                System.out.println("Nhap phi nhap khau: ");
                int phiNhapKhau = Integer.parseInt(sc.nextLine());

                System.out.println("Nhap so lan nhap khau: ");
                int soLanNhapKhau = Integer.parseInt(sc.nextLine());

                ThuocNK TNK = new ThuocNK(ma, tenThuoc, donGiaCB, phiNhapKhau, soLanNhapKhau);
                thuoc.add(TNK);
                System.out.println(TNK);
            } else {
                System.out.println("Lua chon khong hop le, vui long chon lai!");
            }
        }
        // tim gia ban thuoc >= 100;
        System.out.println("\nDanh sach thuoc nhap khau co gia ban >= 100:");
        for (Thuoc t : thuoc) {
            if (t instanceof ThuocNK) {
                ThuocNK tnk = (ThuocNK) t;
                if (tnk.giaBan() >= 100) {
                    System.out.println(tnk);
                }
            }
        }
        // tim va thuoc nhap theo ma
        System.out.println("\nNhap ma thuoc can tim: ");
        String maCanTim = sc.nextLine();
        boolean tim = false;

        for (Thuoc t : thuoc) {
            if (t.getMa().equalsIgnoreCase(maCanTim)) {
                System.out.println("Thong tin thuoc tim thay: ");
                System.out.println(t);
                tim = true;
                break;
            }
        }

        if (!tim) {
            System.out.println("Khong tim thay thuoc voi ma: " + maCanTim);
        }
    }
}
