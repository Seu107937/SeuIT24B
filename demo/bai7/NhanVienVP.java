package demo.bai7;

public class NhanVienVP extends NhanVien {
    public NhanVienVP() {
        super();
    }

    public NhanVienVP(String hoTen, int maNV, double luong) {
        super(hoTen, maNV, luong);
    }

    @Override
    public double tinhLuong() {
        return getLuong() * 100000;
    }

}
