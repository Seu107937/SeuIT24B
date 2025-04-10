package demo.bai2;

public class XeMay extends LoaiXe {
    private int dungTich;

    public XeMay() {
        super();
        dungTich = 0;
    }

    public XeMay(String maXe, String tenXe, String hangXe, int namSX, double giaXe, int dungTich) {
        super(maXe, tenXe, hangXe, namSX, giaXe);
        this.dungTich = dungTich;
    }

    public int getDungTich() {
        return this.dungTich;
    }

    @Override
    public String toString() {
        return "Mã xe: " + getMaXe() + ", Tên xe: " + getTenXe() + ", Hãng xe: " + getHangXe() + ", Năm SX: "
                + getNamSX() + ", Giá xe: " + getGiaXe() + ", Dung tích: " + dungTich + "cc";
    }

}
