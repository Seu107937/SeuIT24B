package demo.bai4;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap mat khau: ");
        int mk = sc.nextInt();
        // while (true) nhap lien tuc dung thi thoi
        while (true) {
            if (mk == 150106) {
                System.out.println("mat khau dung");
                break;

            } else {
                System.out.println("mat khau sai, nhap lai: ");
                mk = sc.nextInt();
            }
        }

    }
}
