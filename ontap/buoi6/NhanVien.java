package ontap.buoi6;

public class NhanVien {
    private String hoTen;
    private double Luong;

    public NhanVien() {
        hoTen = "";
        Luong = 0;
    }

    public NhanVien(String hoTen, double Luong) {
        this.hoTen = hoTen;
        this.Luong = Luong;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return this.Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public double getThuNhap() {
        return Luong;
    }

    @Override
    public String toString() {
        return " Ten: " + hoTen + ", Luong: " + Luong + ", Thu Nhap:" + getThuNhap();
    }

    public void hienThi() {
        System.out.println(this.toString());
    }

}
