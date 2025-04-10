package ontap.buoi8.DemoChyuenXe;

public class XeNoiThanh extends QuanLyThongTin {
    private int soTuyen;
    private int soDiDuoc;

    public XeNoiThanh() {
        soTuyen = 0;
        soDiDuoc = 0;
    }

    public XeNoiThanh(int maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu, int soTuyen, int soDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soDiDuoc = soDiDuoc;
    }

    public int getSoTuyen() {
        return this.soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoDiDuoc() {
        return this.soDiDuoc;
    }

    public void setSoDiDuoc(int soDiDuoc) {
        this.soDiDuoc = soDiDuoc;
    }

    public double getDoanhThu() {
        return super.getDoanhThu() + soDiDuoc * 100;
    }
}
