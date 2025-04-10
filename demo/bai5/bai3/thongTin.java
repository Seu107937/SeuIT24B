package demo.bai5.bai3;

public class thongTin {
    private String hoTen;
    private int tuoi;
    private String que;

    public thongTin() {
        hoTen = "";
        tuoi = 0;
        que = "";
    }

    public thongTin(String hoTen, int tuoi, String que) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.que = que;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public void setTuoi() {
        this.tuoi = tuoi;
    }

    public String getQue() {
        return this.que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ho va ten " + hoTen + " tuoi " + tuoi + " que " + que;
    }

}
