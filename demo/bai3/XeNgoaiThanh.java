package demo.bai3;

public class XeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDi;

    public XeNgoaiThanh() {
        super();
        this.noiDen = "";
        this.soNgayDi = 0;
    }

    public XeNgoaiThanh(int maSoChuyen, String hoTenTaiXe, int soXe, double doangThu, String noiDen, int soNgayDi) {
        super(maSoChuyen, hoTenTaiXe, soXe, doangThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String getNoiDen() {
        return this.noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return this.soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public double getDoanhThu() {
        return this.soNgayDi * 2000 + super.getDoanhThu();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " noiDen: " + noiDen + " soNgayDi: " + soNgayDi;
    }
}
