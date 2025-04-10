package demo.bai3;

public class ChuyenXe {
    private int maSoChuyen;
    private String hoTenTaiXe;
    private int soXe;
    private double doanhThu;

    public ChuyenXe() {
        this.maSoChuyen = 0;
        this.hoTenTaiXe = "";
        this.soXe = 0;
        this.doanhThu = 0;
    }

    public ChuyenXe(int maSoChuyen, String hoTenTaiXe, int soXe, double doangThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doangThu;
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
        return "Chuyen xe co:" + " maSoChuyen " + maSoChuyen + " hoTenTaiXe: " + hoTenTaiXe + " soXe: " + soXe
                + " doanhThu: "
                + doanhThu;
    }
}
