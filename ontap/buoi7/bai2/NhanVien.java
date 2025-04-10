package ontap.buoi7.bai2;

public class NhanVien extends NguoiLaoDong {
    private double thuNhap;

    public NhanVien() {
        super();
        thuNhap = 0;

    }

    public NhanVien(String hoTen, double luongCB, double thuNhap) {
        super(hoTen, luongCB);
        this.thuNhap = thuNhap;
    }

    public double getThuNhap() {
        return this.thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }

}
