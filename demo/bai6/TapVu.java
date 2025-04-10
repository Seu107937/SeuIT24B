package demo.bai6;

public class TapVu extends NguoiLaoDong {
    private double soGiolamViec;

    public TapVu() {
        super();
        soGiolamViec = 0;
    }

    public TapVu(String hoTen, double luongCB, double soGioLamViec) {
        super(hoTen, luongCB);
        this.soGiolamViec = soGioLamViec;
    }

    public double getsoGioLamViec() {
        return this.soGiolamViec;
    }

    public void setsoGioLamViec(double soGioLamViec) {
        this.soGiolamViec = soGioLamViec;
    }

    @Override
    public double getThuNhap() {
        return getLuongCB() * getsoGioLamViec();
    }

    @Override
    public String toString() {
        return "tap vu " + getHoTen() + " co thu nhap " + getThuNhap();
    }
}
