package demo.bai9;

import java.time.LocalDate;

public class GiaoDichTienMat extends GiaoDich {
    private double tienMat;

    public GiaoDichTienMat(String maGiaoDich, LocalDate ngayGiaoDich, double giaDon, double tienMat) {
        super(maGiaoDich, ngayGiaoDich, giaDon);
        this.tienMat = tienMat;
    }

    public double getTienMat() {
        return this.tienMat;
    }

    public void setTienMat(double tienMat) {
        this.tienMat = tienMat;
    }

    @Override
    public double tinhTien() {
        return getTienMat() + getGiaDon();
    }

    @Override
    public String hoaDon() {
        return "Ma Giao Dich: " + getMaGiaoDich() + "\nNgay Giao Dich: " + getNgayGiaoDich() + "\nDon Gia: "
                + getGiaDon() + "\nTien Mat: " + getTienMat();

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Da thanh toan bang tien mat co so tien " + getTienMat();
    }

}
