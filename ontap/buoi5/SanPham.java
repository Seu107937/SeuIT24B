package ontap.buoi5;

import java.util.Scanner;

public class SanPham {
    // khai bao cac thuo tinh
    private String tenSanPham;
    private double donGia;
    private double giamGia;

    // viet cac constructor
    public SanPham() {
        tenSanPham = "";
        donGia = 0;
        giamGia = 0;
    }

    public SanPham(String tenSanPham, double donGia, double giamGia) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSanPham() {
        return this.tenSanPham;
    }

    public void setTenSanPham(String newTenSp) {
        this.tenSanPham = newTenSp;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double newDonGia) {
        this.donGia = newDonGia;
    }

    public double getGiamGia() {
        return this.giamGia;
    }

    public void setGiamGia(double newGiamGia) {
        this.giamGia = newGiamGia;
    }

    // viet cac phuong thuc khac
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ten san pham ");
        tenSanPham = sc.nextLine();

        System.out.println(" don gia san pham ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.println("giam gia san pham ");
        giamGia = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.println(
                "Ten san pham " + tenSanPham + " don gia san pham " + donGia + " duoc giam gia san pham " + giamGia);
        System.out.println("Ten sp " + tenSanPham);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ten sp " + tenSanPham;
    }

}
