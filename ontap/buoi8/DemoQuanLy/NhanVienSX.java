package ontap.buoi8.DemoQuanLy;

public class NhanVienSX extends NhanVien {
    private int soSamPham;

    public NhanVienSX() {
        super();
        soSamPham = 0;
    }

    public NhanVienSX(String hoTen, int namCongTac, int phuCap, double luong, int soSamPham) {
        super(hoTen, namCongTac, phuCap, luong);
        this.soSamPham = soSamPham;
    }

    public int getSoSamPham() {
        return this.soSamPham;
    }

    public void setSoSamPham(int soSamPham) {
        this.soSamPham = soSamPham;
    }

    public double getLuong() {
        return super.getLuong() + soSamPham * 10;
    }

}
