package demo.bai8;

import java.time.LocalDate;

public class TapChi extends TaiLieu {
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    private LocalDate NNTPhatHanh;

    public TapChi() {
        super();
        NNTPhatHanh = LocalDate.now();
        ngayMuon = LocalDate.now();
        ngayTra = LocalDate.now();

    }

    public TapChi(String tenTaiLieu, int maTaiLieu, String nhaXuatBan, LocalDate NNTPhatHanh, LocalDate ngayMuon,
            LocalDate ngayTra) {
        super(tenTaiLieu, maTaiLieu, nhaXuatBan);
        this.NNTPhatHanh = NNTPhatHanh;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;

    }

    public LocalDate getNNTPhatHanh() {
        return this.NNTPhatHanh;
    }

    public void setNNTPhatHanh(LocalDate NNTPhatHanh) {
        this.NNTPhatHanh = NNTPhatHanh;
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
        System.out.println("Tap chi da duoc muon! ");
        return 1;
    }

    @Override
    public int traSach() {
        System.out.println("Tap chi da duoc tra! ");
        return 1;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", Phat hanh " + NNTPhatHanh;
    }
}
