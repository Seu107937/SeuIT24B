package demo.bai9;

import java.time.LocalDate;

public class GiaoDichChuyenKhoan extends GiaoDich {
    private double chuyenKhoan;

    public GiaoDichChuyenKhoan(String maGiaoDich, LocalDate ngayGiaoDich, double giaDon, double chuyenKhoan) {
        super(maGiaoDich, ngayGiaoDich, giaDon);
        this.chuyenKhoan = chuyenKhoan;
    }

    public double getChuyenKhoan() {
        return this.chuyenKhoan;
    }

    public void setChuyenKhoan(double chuyenKhoan) {
        this.chuyenKhoan = chuyenKhoan;
    }

    @Override
    public double tinhTien() {
        return getChuyenKhoan() + getGiaDon();
    }

    @Override
    public String hoaDon() {
        return "Ma Giao Dich: " + getMaGiaoDich() + "\nNgay Giao Dich: " + getNgayGiaoDich() + "\nDon Gia: "
                + getGiaDon() + "\nChuyen khoan: " + getChuyenKhoan();

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Da thanh toan bang  chuyen khoan co so tien " + getChuyenKhoan();
    }
}
