package demo.bai9;

import java.time.LocalDate;

public class GiaoDichTheTinDung extends GiaoDich {
    private double theTinDung;

    public GiaoDichTheTinDung(String maGiaoDich, LocalDate ngayGiaoDich, double giaDon, double theTinDung) {
        super(maGiaoDich, ngayGiaoDich, giaDon);
        this.theTinDung = theTinDung;
    }

    public double getTheTinDung() {
        return this.theTinDung;
    }

    public void setTheTinDung(double theTinDung) {
        this.theTinDung = theTinDung;
    }

    @Override
    public double tinhTien() {
        return getTheTinDung() + getGiaDon();
    }

    @Override
    public String hoaDon() {
        return "Ma Giao Dich: " + getMaGiaoDich() + "\nNgay Giao Dich: " + getNgayGiaoDich() + "\nDon Gia: "
                + getGiaDon() + "\nThe tin dung: " + getTheTinDung();

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Da thanh toan bang the tin dung co so tien " + getTheTinDung();
    }
}
