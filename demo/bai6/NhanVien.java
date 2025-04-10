package demo.bai6;

public class NhanVien extends NguoiLaoDong {

    public NhanVien() {
        super();
    }

    public NhanVien(String hoTen, double luongCB) {
        super(hoTen, luongCB);
    }

    @Override
    public double getThuNhap() {
        return getLuongCB();
    }

    @Override
    public String toString() {
        return "nhan vien ten " + getHoTen() + " co thu nhap " + getThuNhap();
    }

}
