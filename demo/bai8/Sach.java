package demo.bai8;

import java.time.LocalDate;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    public Sach() {
        super();
        tenTacGia = "";
        soTrang = 0;
        ngayMuon = LocalDate.now();
        ngayTra = LocalDate.now();
    }

    public Sach(String tenTaiLieu, int maTaiLieu, String nhaXuatBan, String tenTacGia, int soTrang, LocalDate ngayMuon,
            LocalDate ngayTra) {
        super(tenTaiLieu, maTaiLieu, nhaXuatBan);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public String getTenTacGia() {
        return this.tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return this.soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public LocalDate getNgayMuon() {
        return this.ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public LocalDate getNgayTra() {
        return this.ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }

    @Override
    public int muonSach() {
        System.out.println("Sach da duoc muon! ");
        return 1;
    }

    @Override
    public int traSach() {
        System.out.println("Sach da duoc tra! ");
        return 1;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", Ten tac gia " + tenTacGia + ", so trang " + soTrang + ", ngay muon "
                + ngayMuon + ", ngay tra " + ngayTra;
    }

}
