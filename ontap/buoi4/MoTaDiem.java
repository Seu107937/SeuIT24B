package ontap.buoi4;

import java.util.Scanner;

public class MoTaDiem {
    Double x;
    Double y;

    void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap x: ");
        x = Double.parseDouble(sc.nextLine());

        System.out.println("nhap y: ");
        y = Double.parseDouble(sc.nextLine());
    }

    void xuat() {
        System.out.println("so x: " + x);
        System.out.println("so y: " + y);
        System.out.println("khoang cach den goc toa do " + KC());
    }

    Double KC() {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        MoTaDiem diem = new MoTaDiem();
        diem.nhap();
        diem.xuat();

    }

}
