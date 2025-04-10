package ontap.buoi5;

public class App {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.nhap();
        sp1.xuat();

        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();

        SanPham sp3 = new SanPham(" banh mi sua ", 15000, 2000);
        sp3.setTenSanPham(" banh mi thit ");
        System.out.println(sp3); // in ra cai ko hieu
        // de in ra thong tin, can viet ham toStriung
    }

}
