package demo.bai7;

public class NhanVienSX extends NhanVien {

    public NhanVienSX() {

        super();
    }

    public NhanVienSX(String hoTen, int maNV, double luong) {
        super(hoTen, maNV, luong);
    }

    @Override
    public double tinhLuong() {
        return getLuong() * 200000;
    }
}
