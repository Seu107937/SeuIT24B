package demo.bai8;

abstract public class TaiLieu implements IChoMuon {
    private String tenTaiLieu;
    private int maTaiLieu;
    private String nhaXuatBan;

    public TaiLieu() {
        tenTaiLieu = "";
        maTaiLieu = 0;
        nhaXuatBan = "";
    }

    public TaiLieu(String tenTaiLieu, int maTaiLieu, String nhaXuatBan) {
        this.tenTaiLieu = tenTaiLieu;
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getTenTaiLieu() {
        return this.tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public int getMaTaiLieu() {
        return this.maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return this.nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    abstract public int muonSach();

    @Override
    abstract public int traSach();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Ten Tai lieu " + tenTaiLieu + ", ma tai lieu " + maTaiLieu + ", nha xuat ban "
                + nhaXuatBan;
    }
}
