package demo.bai9;

import java.time.LocalDate;

abstract public class GiaoDich implements IThanhToan {
    private String maGiaoDich;
    private LocalDate ngayGiaoDich;
    private double giaDon;

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double giaDon) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.giaDon = giaDon;
    }

    public String getMaGiaoDich() {
        return this.maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return this.ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getGiaDon() {
        return this.giaDon;
    }

    public void setGiaDon(double giaDon) {
        this.giaDon = giaDon;
    }

    @Override
    abstract public double tinhTien();

    @Override
    abstract public String hoaDon();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " Ma giao dich " + maGiaoDich + " ngay giao dich " + ngayGiaoDich + " gia don "
                + giaDon;
    }

}
