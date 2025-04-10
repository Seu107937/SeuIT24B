package ontap.buoi7.bai1;

public class Vuong extends ChuNhat {
    private double canh;

    public Vuong() {
        super();
        canh = 0;
    }

    public Vuong(double rong, double dai, double canh) {
        super(dai, rong);
        this.canh = canh;
    }

    public double getCanh() {
        return this.canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", canh " + canh;
    }

    public void xuat() {
        System.out.println("Hinh vuong co canh: " + dai);
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Dien tich: " + getDienTich());
    }
}
