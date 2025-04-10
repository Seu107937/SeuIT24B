package ontap.buoi9;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<SinhVien> DanhSachSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChon sinh vien: (1) Sinh Vien IT, (2) Sinh Vien Biz, (0) thoat: ");
            String chon = sc.nextLine();

            if (chon.equalsIgnoreCase("0")) {
                System.out.println("Ket thuc chuong trinh!");
                break;
            }

            System.out.println("Nhap id sinh vien: ");
            String id = sc.nextLine();

            System.out.println("Nhap ho va ten sinh vien: ");
            String hoTen = sc.nextLine();

            try {
                if (chon.equalsIgnoreCase("1")) {

                    System.out.println("NHap diem Java: ");
                    double diemJava = Double.parseDouble(sc.nextLine());

                    System.out.println("Nhap diem Css: ");
                    double diemCss = Double.parseDouble(sc.nextLine());

                    SinhVienIT SVIT = new SinhVienIT(id, hoTen, diemJava, diemCss);
                    DanhSachSV.add(SVIT);

                    System.out.println(hoTen + " co diem trung binh la: " + SVIT.getDiemTB());

                } else if (chon.equalsIgnoreCase("2")) {

                    System.out.println("Nhap diem marketing: ");
                    double marketing = Double.parseDouble(sc.nextLine());

                    System.out.println("Nhap diem ke toan:");
                    double keToan = Double.parseDouble(sc.nextLine());

                    System.out.println("Nhap diem ban hang:");
                    double banHang = Double.parseDouble(sc.nextLine());

                    SinhVienBiz SVBiz = new SinhVienBiz(id, hoTen, marketing, keToan, banHang);
                    DanhSachSV.add(SVBiz);

                    System.out.println(hoTen + " co diem trung binh la: " + SVBiz.getDiemTB());
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang, vui long nhap lai!");
                continue;
            }

        }
        while (true) {
            System.out.println("\nBan co muon tim sinh vien khong? (C/K): ");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("K")) {
                System.out.println("Ket thuc chuong trinh!");
                break;
            }

            System.out.println("Nhap id sinh vien can tim: ");
            String timId = sc.nextLine();

            boolean tim = false; // Đặt lại biến tim cho mỗi lần tìm kiếm
            for (SinhVien sv : DanhSachSV) {
                if (sv.getId().equalsIgnoreCase(timId)) {
                    System.out.println("Ho ten: " + sv.getHoTen() + " Diem trung binh: " + sv.getDiemTB());
                    tim = true;
                    break;
                }
            }
            if (!tim) {
                System.out.println("Khong tim thay sinh vien co id la: " + timId);
            }
        }

    }

}
