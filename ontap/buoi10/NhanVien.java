package ontap.buoi10;

public class NhanVien extends NguoiLaoDong {

    public NhanVien() {
        super();
    }

    public NhanVien(String hoTen, double luongCB, double ThuNhap) {
        super(hoTen, luongCB);

    }

    @Override
    public double getThuNhap() {
        return this.getLuongCB();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Thu nhap: " + getThuNhap();
    }
}
