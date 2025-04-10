package ontap.buoi7.bai2;

public class Quanly extends NguoiLaoDong {
    private double phuCap;

    public Quanly() {
        super();
        phuCap = 0;
    }

    public Quanly(String hoTen, double luongCB, double phuCap) {
        super(hoTen, luongCB);
        this.phuCap = phuCap;
    }

    public double getPhuCap() {
        return this.phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public double getThuNhap() {
        return luongCB + phuCap;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " phu cap " + phuCap;
    }

}
