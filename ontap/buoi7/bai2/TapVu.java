package ontap.buoi7.bai2;

public class TapVu extends NguoiLaoDong {
    private double soGioLamViec;
    private static final double luong_gio = 50000;

    public TapVu() {
        super("", 0);
        this.soGioLamViec = 0;
    }

    public TapVu(String hoTen, double soGioLamViec) {
        super(hoTen, 0);
        this.soGioLamViec = soGioLamViec;
    }

    public double getSoGioLamViec() {
        return this.soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public double getThuNhap() {
        return soGioLamViec * luong_gio;
    }

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", So gio lam viec: " + soGioLamViec + ", Thu nhap: " + getThuNhap();
    }
}