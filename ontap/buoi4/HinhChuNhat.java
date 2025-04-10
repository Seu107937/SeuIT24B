package ontap.buoi4;

import java.util.Scanner;

public class HinhChuNhat {
    Double chieuDai;
    Double chieuRong;

    void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu dai: ");
        chieuDai = Double.parseDouble(sc.nextLine());

        System.out.println("Nhap chieu rong: ");
        chieuRong = Double.parseDouble(sc.nextLine());
    }

    void xuat() {
        System.out.println("Chieu dai " + chieuDai);
        System.out.println("Chieu rong " + chieuRong);
        System.out.println("Chu vi " + chuVi());
        System.out.println("Dien tich " + dienTich());
    }

    Double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    Double dienTich() {
        return chieuDai * chieuRong;
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap();
        hcn.xuat();
    }

}
