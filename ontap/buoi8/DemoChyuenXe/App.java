package ontap.buoi8.DemoChyuenXe;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<QuanLyThongTin> danhSachXe = new ArrayList<>();

        System.out.print("Nhập số lượng chuyến xe: ");
        int soLuongXe = scanner.nextInt();

        for (int i = 0; i < soLuongXe; i++) {
            System.out.println("\nNhập thông tin cho chuyến xe thứ " + (i + 1) + ":");
            System.out.print("Nhập loại xe (1: Nội thành, 2: Ngoại thành): ");
            int loaiXe = scanner.nextInt();

            System.out.print("Nhập mã số xe: ");
            int maSo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nhập tên tài xế: ");
            String hoTen = scanner.nextLine();

            System.out.print("Nhập số xe: ");
            int soXe = scanner.nextInt();

            System.out.print("Nhập doanh thu: ");
            double doanhThu = scanner.nextDouble();

            if (loaiXe == 1) {
                System.out.print("Nhập số tuyến: ");
                int soTuyen = scanner.nextInt();

                System.out.print("Nhập số km đi được: ");
                int soKm = scanner.nextInt();

                XeNoiThanh xeNoiThanh = new XeNoiThanh(maSo, hoTen, soXe, doanhThu, soTuyen, soKm);
                danhSachXe.add(xeNoiThanh);
            } else if (loaiXe == 2) {
                scanner.nextLine();
                System.out.print("Nhập nơi đến: ");
                String noiDen = scanner.nextLine();

                System.out.print("Nhập số ngày đi: ");
                int soNgayDi = scanner.nextInt();

                XeNgoaiThanh xeNgoaiThanh = new XeNgoaiThanh(maSo, hoTen, soXe, doanhThu, noiDen, soNgayDi);
                danhSachXe.add(xeNgoaiThanh);
            } else {
                System.out.println("Loại xe không hợp lệ! Bỏ qua.");
            }
        }

        System.out.println("\n--- Danh sách các chuyến xe ---");
        for (QuanLyThongTin xe : danhSachXe) {
            System.out.println(xe.toString());
            System.out.println("Doanh thu: " + xe.getDoanhThu());
        }

        System.out.print("\nNhập mã số chuyến xe cần tìm: ");
        int maSoCanTim = scanner.nextInt();

        QuanLyThongTin timThay = timChuyenXeTheoMa(danhSachXe, maSoCanTim);
        if (timThay != null) {
            System.out.println("\nChuyến xe có mã số " + maSoCanTim + ":\n" + timThay.toString());
        } else {
            System.out.println("\nKhông tìm thấy chuyến xe có mã số " + maSoCanTim);
        }

        QuanLyThongTin xeDoanhThuCaoNhat = timXeDoanhThuCaoNhat(danhSachXe);
        if (xeDoanhThuCaoNhat != null) {
            System.out.println("\nChuyến xe có doanh thu cao nhất:\n" + xeDoanhThuCaoNhat.toString());
            System.out.println("Doanh thu cao nhất: " + xeDoanhThuCaoNhat.getDoanhThu());
        }

    }

    public static QuanLyThongTin timChuyenXeTheoMa(ArrayList<QuanLyThongTin> danhSachXe, int maSo) {
        for (QuanLyThongTin xe : danhSachXe) {
            if (xe.getSoXe() == maSo) {
                return xe;
            }
        }
        return null;
    }

    public static QuanLyThongTin timXeDoanhThuCaoNhat(ArrayList<QuanLyThongTin> danhSachXe) {
        if (danhSachXe.isEmpty()) {
            return null;
        }

        QuanLyThongTin xeMax = danhSachXe.get(0);
        for (QuanLyThongTin xe : danhSachXe) {
            if (xe.getDoanhThu() > xeMax.getDoanhThu()) {
                xeMax = xe;
            }
        }
        return xeMax;
    }
}