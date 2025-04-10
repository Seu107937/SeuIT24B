package demo.bai6;

public class NguoiLaoDong implements INguoiLaoDong {
    private String hoTen;
    private double luongCB;

    public NguoiLaoDong() {
        hoTen = "";
        luongCB = 0;
    }

    public NguoiLaoDong(String hoTen, double luongCB) {
        this.hoTen = hoTen;
        this.luongCB = luongCB;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCB() {
        return this.luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    @Override
    public double getThuNhap() {
        return this.luongCB;
    }

    @Override
    public String toString() {
        return "nhan vien ten " + getHoTen() + " co thu nhap la: " + getThuNhap();
    }
}
