package ontap.buoi7.bai2;

public class NguoiLaoDong {
    protected String hoTen;
    protected double luongCB;

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

    public double getThuNhap() {
        return luongCB;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ho ten: " + hoTen + " luong " + luongCB + " thu nhap " + getThuNhap();
    }
}
