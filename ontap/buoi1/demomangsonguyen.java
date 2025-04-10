package ontap.buoi1;

import java.util.Scanner;

public class demomangsonguyen {
    public static void main(String[] args) {
        int[] a = new int[200];
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("a [" + i + "] = ");
            a[i] = sc.nextInt();
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        System.out.println("nhap gia tri n");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        System.out.println("TBC= " + ((double) tong / n));
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]^2 = " + Math.pow(a[i], 2));
        }

    }

}
