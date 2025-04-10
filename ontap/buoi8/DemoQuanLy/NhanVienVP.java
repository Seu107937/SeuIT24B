package ontap.buoi8.DemoQuanLy;

public class NhanVienVP extends NhanVien {
    private double mucLuong;
    private int soNgayNghi;

    public NhanVienVP() {
        super();
        this.mucLuong = 0;
        this.soNgayNghi = 0;
    }

    public NhanVienVP(String hoTen, int namCongTac, int phuCap, double luong, double mucLuong, int soNgayNghi) {
        super(hoTen, namCongTac, phuCap, luong);
        this.mucLuong = mucLuong;
        this.soNgayNghi = soNgayNghi;
    }

    public double getMucLuong() {
        return this.mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getSoNgayNghi() {
        return this.soNgayNghi;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }

    public double getLuong() {
        return super.getLuong() + (mucLuong - soNgayNghi) * 10;
    }
}
