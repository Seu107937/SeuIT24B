package demo.bai5.bai2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        // nhap tu ban phim tinh tong va tich cua a va b

        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap so nguyen a: ");
        int a = sc.nextInt();

        System.out.println("\nNhap so nguyen b:");
        int b = sc.nextInt();

        int c = a + b;
        int d = a * b;
        System.out.println("\nTong hay so: " + c);
        System.out.println("\nTich hay so: " + d);
    }
}
