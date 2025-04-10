package ontap.buoi11;

public class ThuocND extends Thuoc {
    private int giaBaoQuan;
    private int giaVanChuyen;

    public ThuocND() {
        super();
        giaBaoQuan = 0;
        giaVanChuyen = 0;
    }

    public ThuocND(String ma, String tenThuoc, int donGiaCB, int giaBaoQuan, int giaVanChuyen) {
        super(ma, tenThuoc, donGiaCB);
        this.giaBaoQuan = giaBaoQuan;
        this.giaVanChuyen = giaVanChuyen;
    }

    public int getGiaBaoQuan() {
        return this.giaBaoQuan;
    }

    public void setGiaBaoQuan(int giaBaoQuan) {
        this.giaBaoQuan = giaBaoQuan;
    }

    public int getGiaVanChuyen() {
        return this.giaVanChuyen;
    }

    public void setGiaVanChuyen(int giaVanChuyen) {
        this.giaVanChuyen = giaVanChuyen;
    }

    @Override
    public double giaBan() {
        return getGiaBaoQuan() + getGiaVanChuyen() + getDonGiaCB();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Gia bao quan " + giaBaoQuan + " Gia van chuyen " + giaVanChuyen + " Gia ban "
                + giaBan();
    }
}
