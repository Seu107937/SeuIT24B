package demo.bai6;

public class QuanLy extends NguoiLaoDong {
    private double phuCap;

    public QuanLy() {
        super();
        phuCap = 0;
    }

    public QuanLy(String hoTen, double luongCB, double phuCap) {
        super(hoTen, luongCB);
        this.phuCap = phuCap;
    }

    public double getPhuCap() {
        return this.phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public double getThuNhap() {
        return getLuongCB() + phuCap;
    }

    @Override
    public String toString() {
        return "quan ly " + getHoTen() + " co thu nhap: " + getThuNhap();
    }
}
