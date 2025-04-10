package ontap.buoi7.bai1;

public class ChuNhat {
    protected double dai;
    protected double rong;

    public ChuNhat() {
        dai = 0;
        rong = 0;
    }

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return (dai * rong);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " dai: " + dai + " rong: " + rong + " chu vi: " + getChuVi() + " dien tich: " + getDienTich();
    }

    public void xuat() {
        System.out.println("chieu dai: " + dai);
        System.out.println("chieu rong: " + rong);
        System.out.println("chu vi: " + getChuVi());
        System.out.println("dien tich: " + getDienTich());
    }

}
