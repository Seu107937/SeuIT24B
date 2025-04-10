package demo.bai5.bai3;

public class nhanVien extends thongTin {
    private double luong;

    public nhanVien() {
        super();
        luong = 0;
    }

    public nhanVien(String hoTen, int tuoi, String que, double luong) {
        super(hoTen, tuoi, que);
        this.luong = luong;
    }

    public double getLuong() {
        return this.luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
