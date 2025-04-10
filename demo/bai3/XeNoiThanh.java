package demo.bai3;

public class XeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private int soKmDiDuoc;

    public XeNoiThanh() {
        super();
        this.soTuyen = 0;
        this.soKmDiDuoc = 0;
    }

    public XeNoiThanh(int maSoChuyen, String hoTenTaiXe, int soXe, double doangThu, int soTuyen, int soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doangThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;

    }

    public int getSoTuyen() {
        return this.soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDiDuoc() {
        return this.soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public double getDoanhThu() {
        return this.soKmDiDuoc * 1000 + super.getDoanhThu();
    }

    @Override
    public String toString() {
        return super.toString() + " soTuyen: " + soTuyen + " soKmDiDuoc: " + soKmDiDuoc;
    }
}
