package demo.bai8;

import java.time.LocalDate;

public class Bao extends TaiLieu {
    private LocalDate ngayPhatHanh;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    public Bao() {
        ngayPhatHanh = LocalDate.now();
        ngayMuon = LocalDate.now();
        ngayTra = LocalDate.now();
    }

    public Bao(String tenTaiLieu, int maTaiLieu, String nhaXuatBan, LocalDate ngayPhatHanh, LocalDate ngayMuon,
            LocalDate ngayTra) {
        super(tenTaiLieu, maTaiLieu, nhaXuatBan);
        this.ngayPhatHanh = ngayPhatHanh;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    public LocalDate getNgayPhatHanh() {
        return this.ngayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
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
        System.out.println("Bao da duoc muon! ");
        return 1;
    }

    @Override
    public int traSach() {
        System.out.println("Bao da duoc tra! ");
        return 1;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", Ngay phat hanh " + ngayPhatHanh + ", Ngay muon " + ngayMuon
                + ", Ngay tra " + ngayTra;
    }
}
