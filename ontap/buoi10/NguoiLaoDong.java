package ontap.buoi10;

abstract public class NguoiLaoDong implements INguoiLaoDong {

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
    abstract public double getThuNhap();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Ho ten: " + hoTen + "\n" + "Luong co ban: " + luongCB;
    }
}
