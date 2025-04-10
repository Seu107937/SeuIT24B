package demo.bai2;

public class LoaiXe {
    private String maXe;
    private String tenXe;
    private String hangXe;
    private int namSX;
    private double giaXe;

    public LoaiXe() {
        maXe = "";
        tenXe = "";
        hangXe = "";
        namSX = 0;
        giaXe = 0;
    }

    public LoaiXe(String maXe, String tenXe, String hangXe, int namSX, double giaXe) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.hangXe = hangXe;
        this.namSX = namSX;
        this.giaXe = giaXe;
    }

    public String getMaXe() {
        return this.maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return this.tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangXe() {
        return this.hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSX() {
        return this.namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGiaXe() {
        return this.giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Mã xe: " + maXe + ", Tên xe: " + tenXe + ", Hãng xe: " + hangXe + ", Năm SX: " + namSX
                + ", Giá xe: " + giaXe;
    }

}
