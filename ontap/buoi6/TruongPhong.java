package ontap.buoi6;

public class TruongPhong extends NhanVien {
    private double trachNhiem;

    public TruongPhong() {
        super();
        trachNhiem = 0;
    }

    public TruongPhong(String hoTen, double Luong, double trachNhiem) {
        super(hoTen, Luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return this.trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        // TODO Auto-generated method stub
        return super.getThuNhap() + trachNhiem;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", Trach nhiem " + trachNhiem;
    }
}
