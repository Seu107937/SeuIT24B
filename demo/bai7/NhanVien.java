package demo.bai7;

abstract public class NhanVien implements ITinhLuong {
    private String hoTen;
    private int maNV;
    private double luong;

    public NhanVien() {
        hoTen = "";
        maNV = 0;
        luong = 0;
    }

    public NhanVien(String hoTen, int maNV, double luong) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.luong = luong;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getMaNV() {
        return this.maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public double getLuong() {
        return this.luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    abstract public double tinhLuong();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " ho va ten " + hoTen + " ma nhan vien " + maNV + " luong " + luong + " tinh luong "
                + tinhLuong();
    }

}
