package ontap.buoi9;

abstract public class SinhVien {
    private String id;
    private String hoTen;

    public SinhVien() {
        id = "";
        hoTen = "";
    }

    public SinhVien(String id, String hoTen) {
        this.id = id;
        this.hoTen = hoTen;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    abstract public double getDiemTB();

}
