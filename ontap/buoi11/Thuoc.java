package ontap.buoi11;

abstract public class Thuoc implements IThuoc {
    private String ma;
    private String tenThuoc;
    private int donGiaCB;

    public Thuoc() {
        ma = "";
        tenThuoc = "";
        donGiaCB = 0;
    }

    public Thuoc(String ma, String tenThuoc, int donGiaCB) {
        this.ma = ma;
        this.tenThuoc = tenThuoc;
        this.donGiaCB = donGiaCB;
    }

    public String getMa() {
        return this.ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenThuoc() {
        return this.tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getDonGiaCB() {
        return this.donGiaCB;
    }

    public void setDonGiaCB(int donGiaCB) {
        this.donGiaCB = donGiaCB;
    }

    @Override
    abstract public double giaBan();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "Ma " + ma + " Ten thuoc " + tenThuoc + " Don gia co ban " + donGiaCB;
    }
}
