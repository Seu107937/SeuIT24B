package ontap.buoi8.DemoChyuenXe;

public class QuanLyThongTin {
    private int maSoChuyen;
    private String hoTenTaiXe;
    private int soXe;
    private double doanhThu;

    public QuanLyThongTin() {
        maSoChuyen = 0;
        hoTenTaiXe = "";
        soXe = 0;
        doanhThu = 0;
    }

    public QuanLyThongTin(int maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public int getMaSoChuyen() {
        return this.maSoChuyen;
    }

    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return this.hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public int getSoXe() {
        return this.soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return this.doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ma So Chuyen: " + maSoChuyen + ", Ho Ten Tai Xe: " + hoTenTaiXe + ", So Xe: " + soXe + ", Doanh Thu: "
                + doanhThu;
    }
}
