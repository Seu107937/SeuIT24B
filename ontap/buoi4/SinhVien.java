package ontap.buoi4;

import java.util.Scanner;

public class SinhVien {
    String hoTen;
    Double diem;

    void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        // this.hoTen = sc.nextLine();

        System.out.println("nhap diem: ");
        diem = Double.parseDouble(sc.nextLine());
    }

    void xuat() {
        System.out.println("HT " + hoTen + ", Diem " + diem + ", XL " + getXL());
    }

    String getXL() {
        if (diem > 9)
            return "XS";
        else if (diem > 8)
            return "G";
        else if (diem > 7)
            return "k";
        else if (diem > 5)
            return "TB";
        else
            return "Y";
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.xuat();
    }

}
