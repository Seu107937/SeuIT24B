package ontap.buoi8.DemoQuanLy;

public class NhanVien {
    private String hoTen;
    private int namCongTac;
    private int phuCap;
    private double luong;

    public NhanVien() {
        hoTen = "";
        namCongTac = 0;
        phuCap = 100;
        luong = 0;
    }

    public NhanVien(String hoTen, int namCongTac, int phuCap, double luong) {
        this.hoTen = hoTen;
        this.namCongTac = namCongTac;
        this.phuCap = phuCap + namCongTac * 20;
        this.luong = luong;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamCongTac() {
        return this.namCongTac;
    }

    public void setNamCongTac(int namCongTac) {
        this.namCongTac = namCongTac;
    }

    public int getPhuCap() {
        return this.phuCap;
    }

    public void setPhuCap(int phuCap) {
        this.phuCap = phuCap;
    }

    public double getLuong() {
        return this.luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Ten: " + hoTen + ", Nam Cong Tac: " + namCongTac + ", Phu Cap: " + phuCap + ", Luong: " + luong;
    }
}
