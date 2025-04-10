package ontap.buoi9;

public class SinhVienBiz extends SinhVien {
    private double keToan;
    private double marKeting;
    private double banHang;

    public SinhVienBiz() {
        keToan = 0;
        marKeting = 0;
        banHang = 0;
    }

    public SinhVienBiz(String id, String hoTen, double keToan, double marKeting, double banHang) {
        super(id, hoTen);
        this.keToan = keToan;
        this.marKeting = marKeting;
        this.banHang = banHang;
    }

    public double getKeToan() {
        return this.keToan;
    }

    public void setKeToan(double keToan) {
        this.keToan = keToan;
    }

    public double getMarKetting() {
        return this.marKeting;
    }

    public void setMarKetting(double marKetting) {
        this.marKeting = marKetting;
    }

    public double getBanHang() {
        return this.banHang;
    }

    public void setBanHang(double banHang) {
        this.banHang = banHang;
    }

    @Override
    public double getDiemTB() {
        return (keToan + marKeting + banHang) / 3;
    }
}
