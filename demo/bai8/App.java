package demo.bai8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TaiLieu> TL = new ArrayList<TaiLieu>();

        // nhap

        while (true) {
            System.out.println("\nMoi chon tai lieu: (1): Sach, (2): Bao, (3): Tap chi, (0): Thoat");
            int chon = Integer.parseInt(sc.nextLine());
            if (chon == 0) {
                System.out.println("Thoat chuong trinh!");
                break;
            }
            if (chon < 1 || chon > 3) {
                System.out.println("Lua chon khong hop le!");
                continue;
            }
            System.out.println("Nhap ten tai lieu: ");
            String tenTaiLieu = sc.nextLine();

            System.out.println("Nhap ma tai lieu: ");
            int maTaiLieu = Integer.parseInt(sc.nextLine());

            System.out.println("Nhap nha xuat ban: ");
            String nhaXuatBan = sc.nextLine();

            if (chon == 1) {
                System.out.println("Nhap ten tac gia: ");
                String tenTacGia = sc.nextLine();

                System.out.println("Nhap so trang: ");
                int soTrang = Integer.parseInt(sc.nextLine());

                DateTimeFormatter dinhDangNgay = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                System.out.println("Nhap ngay muon (dd-MM-yyyy): ");
                LocalDate ngayMuon = LocalDate.parse(sc.nextLine(), dinhDangNgay);

                System.out.println("Nhap ngay tra (dd-MM-yyyy): ");
                LocalDate ngayTra = LocalDate.parse(sc.nextLine(), dinhDangNgay);

                Sach sach = new Sach(tenTaiLieu, maTaiLieu, nhaXuatBan, tenTacGia, soTrang, ngayMuon, ngayTra);
                TL.add(sach);
                System.out.println("\n" + sach);

            } else if (chon == 2) {
                DateTimeFormatter dinhDangNgay = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                System.out.println("Nhap ngay phat hanh (dd-MM-yyyy): ");
                LocalDate ngayPhatHanh = LocalDate.parse(sc.nextLine(), dinhDangNgay);

                System.out.println("Nhap ngay muon (dd-MM-yyyy): ");
                LocalDate ngayMuon = LocalDate.parse(sc.nextLine(), dinhDangNgay);

                System.out.println("Nhap ngay tra (dd-MM-yyyy): ");
                LocalDate ngayTra = LocalDate.parse(sc.nextLine(), dinhDangNgay);

                Bao bao = new Bao(tenTaiLieu, maTaiLieu, nhaXuatBan, ngayPhatHanh, ngayMuon, ngayTra);
                TL.add(bao);
                System.out.println("\n" + bao);

            } else if (chon == 3) {
                DateTimeFormatter dinhDangNgay = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                System.out.println("Nhap ngay phat hanh (dd-MM-yyyy): ");
                LocalDate ngayPhatHanh = LocalDate.parse(sc.nextLine(), dinhDangNgay);

                System.out.println("Nhap ngay muon (dd-MM-yyyy): ");
                LocalDate ngayMuon = LocalDate.parse(sc.nextLine(), dinhDangNgay);

                System.out.println("Nhap ngay tra (dd-MM-yyyy): ");
                LocalDate ngayTra = LocalDate.parse(sc.nextLine(), dinhDangNgay);

                TapChi tapChi = new TapChi(tenTaiLieu, maTaiLieu, nhaXuatBan, ngayPhatHanh, ngayMuon, ngayTra);
                TL.add(tapChi);
                System.out.println("\n" + tapChi);
            }
        }
        // tim danh sach tai lieu da nhap

        System.out.println("Moi nhap ten tai lieu can tim:");
        String tenTim = sc.nextLine();
        boolean tim = false;
        for (TaiLieu tl : TL) {
            if (tl.getTenTaiLieu().equalsIgnoreCase(tenTim)) {
                System.out.println("Da tim thay tai lieu: " + tl);
                tim = true;
                break;
            }
        }
        if (!tim) {
            System.out.println("Khong tim thay tai lieu: " + tenTim + " moi nhap lai!");
        }

    }
}
