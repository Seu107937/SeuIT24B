package ontap.buoi1;

import java.util.Scanner;

public class demothuethunhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap luong: ");
        double luong = sc.nextDouble();

        System.out.println(" nhap thuong: ");
        double thuong = sc.nextDouble();

        double thuNhap = luong + thuong;

        double thue = 0;
        if (thuNhap < 9000000)
            thue = 0;
        else if (thuNhap < 15000000)
            thue = 0 + (thuNhap - 9000000) * 0.1;
        else if (thuNhap < 30000000)
            thue = 0 + 6000000 * 0.1 + (thuNhap - 15000000) * 0.2;
        else
            thue = 0 + 6000000 * 0.1 + 15000000 * 0.15 + (thuNhap - 30000000) * 0.2;

        System.out.println("tien thue la: " + thue);
    }

}
