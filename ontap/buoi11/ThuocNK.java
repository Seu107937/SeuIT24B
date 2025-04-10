package ontap.buoi11;

public class ThuocNK extends Thuoc {
    private int phiNhapKhau;
    private int soLanNhapKhau;

    public ThuocNK() {
        super();
        phiNhapKhau = 0;
        soLanNhapKhau = 0;

    }

    public ThuocNK(String ma, String tenThuoc, int donGiaCB, int phiNhapKhau, int soLanNhapKhau) {
        super(ma, tenThuoc, donGiaCB);
        this.phiNhapKhau = phiNhapKhau;
        this.soLanNhapKhau = soLanNhapKhau;

    }

    public int getPhiNhapKhau() {
        return this.phiNhapKhau;
    }

    public void setPhiNhapKhau(int phiNhapKhau) {
        this.phiNhapKhau = phiNhapKhau;
    }

    public int getSoLanNhapKhau() {
        return this.soLanNhapKhau;
    }

    public void setSoLanNhapKhau(int soLanNhapKhau) {
        this.soLanNhapKhau = soLanNhapKhau;
    }

    @Override
    public double giaBan() {
        int phuPhi = 0;
        if (soLanNhapKhau < 5) {
            phuPhi = 10;
        } else {
            phuPhi = 50;
        }
        return getPhiNhapKhau() * getSoLanNhapKhau() + phuPhi + getDonGiaCB();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Phi nhap khau " + phiNhapKhau + " So lan nhap khau " + soLanNhapKhau
                + " gia ban " + giaBan();
    }
}
