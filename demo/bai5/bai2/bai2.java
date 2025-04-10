package demo.bai5.bai2;

import java.util.Scanner;

public class bai2 {
    public void thongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap ho va ten cua ban: ");
        String hoTen = sc.nextLine();

        System.out.println("\n Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();

        System.out.println("\n chao ban " + hoTen + " nam nay ban " + tuoi
                + " tuoi chuc ban mot ngay tot lanh chua ban phuoc cho " + hoTen
                + ", moi ngay la mot niem vui hay cuoi nhieu len nhe,\n cho mot ngay troi qua co y nghia, cam on "
                + hoTen
                + " da lang nghe ");
    }

    public static void main(String[] args) {
        bai2 tt = new bai2();
        tt.thongTin();
    }
}
