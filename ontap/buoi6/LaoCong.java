package ontap.buoi6;

public class LaoCong extends NhanVien {

    public LaoCong() {
        super();
        gioLam = 0;
    }

    public LaoCong(String hoTen, double Luong, double gioLam) {
        super(hoTen, Luong);
        this.gioLam = gioLam;
    }

    private double gioLam;

    public double getGioLam() {
        return this.gioLam;
    }

    public void setGioLam(double gioLam) {
        this.gioLam = gioLam;
    }

    @Override
    public double getThuNhap() {
        // TODO Auto-generated method stub
        return super.getThuNhap() + gioLam;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Gio lam them " + gioLam;
    }

}
