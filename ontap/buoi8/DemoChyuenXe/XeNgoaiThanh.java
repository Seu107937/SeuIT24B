package ontap.buoi8.DemoChyuenXe;

public class XeNgoaiThanh extends QuanLyThongTin {

    public XeNgoaiThanh() {
        noiDen = "";
        ngayDiDuoc = 0;
    }

    public XeNgoaiThanh(int maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu, String noiDen, int ngayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.ngayDiDuoc = ngayDiDuoc;
    }

    private String noiDen;
    private int ngayDiDuoc;

    public String getNoiDen() {
        return this.noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getNgayDiDuoc() {
        return this.ngayDiDuoc;
    }

    public void setNgayDiDuoc(int ngayDiDuoc) {
        this.ngayDiDuoc = ngayDiDuoc;
    }

    public double getDoanhThu() {
        return super.getDoanhThu() + ngayDiDuoc * 200;
    }

}
