package ontap.buoi10;

public class TapVu extends NguoiLaoDong {
    private int soGioLamViec;

    public TapVu() {
        super();
        soGioLamViec = 0;
    }

    public TapVu(String hoTen, double luongCB, int soGioLamViec) {
        super(hoTen, luongCB);
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return this.soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public double getThuNhap() {
        return this.getLuongCB() * soGioLamViec;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "So gio lam viec: " + soGioLamViec + "\n" + "Thu nhap: " + getThuNhap();
    }
}
