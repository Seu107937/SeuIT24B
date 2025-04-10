package ontap.buoi9;

public class SinhVienIT extends SinhVien {
    private double diemJava;
    private double diemCss;

    public SinhVienIT() {
        diemJava = 0;
        diemCss = 0;
    }

    public SinhVienIT(String id, String hoTen, double diemJava, double diemCss) {
        super(id, hoTen);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
    }

    public double getDiemJava() {
        return this.diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return this.diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    @Override
    public double getDiemTB() {
        return (2 * diemJava + diemCss) / 3;
    }

}
