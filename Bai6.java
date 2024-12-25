package buoi11;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class Bai6 {
    // bài 6 tính tổng S = 4! + 5! + 7! + 9!
    public static long tinhGiaiThua(int n) {
        long kq = 1;
        for (int i = 1; i <= n; i++) {
            kq *= i;
        }
        return kq;

    }

    public static long tinhTongGiaiThua(int a, int b, int c, int d) {

        long tong = 0;
        tong = tinhGiaiThua(4) + tinhGiaiThua(5) + tinhGiaiThua(7) + tinhGiaiThua(9);
        return tong;
    }

    /*
     * Bài 18 Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố.
     * Ví dụ: Số
     * 28 được phân tích thành 2 x 2 x 7
     */
    public static void phanTichThuaSoNguyenTo(int n) {
        System.out.printf("\n Số %d được phân tích thành: ", n);
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.print("\t" + i);
                n /= i;
            } else
                i++;

        }

    }

    /*
     * Bài 5. Viết chương trình sắp xếp mảng các số nguyên theo chiều tăng dần giá
     * trị các phần
     * tử
     */
    public static int[] sapXepMangTang(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tam = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tam;

                }
            }
        }
        return a;
    }

    public static void hienThiMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }

    /*
     * Bài 10. Viết chương trình sắp xếp mảng các số nguyên theo chiều giảm dần giá
     * trị các phần
     * tử.
     */
    public static int[] sapXepMangTheoChieuGiam(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int tam = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tam;

                }
            }
        }
        return a;
    }

    /*
     * Bài 7. Viết chương trình tìm ước số chung lớn nhất của hai số nguyên nhập vào
     * từ bàn
     * phím
     */
    public static int timUocSoChungLonNhat(int num1, int num2) {
        int uscln;
        while (num2 != 0) {
            uscln = num1 % num2;
            num1 = num2;
            num2 = uscln;

        }
        return num1;
    }

    /*
     * Bài 8. Viết chương trình tìm bội số chung nhỏ nhất của hai số nguyên nhập vào
     * từ bàn
     * phím.
     */
    public static int timBoiSoChungNhoNhat(int num1, int num2) {
        return Math.abs(num1 * num2) / timUocSoChungLonNhat(num1, num2);
    }

    public static void main(String[] args) {
        /*
         * int a[] = { -2, 0, 10, 9, 7, 4 };
         * System.out.println("\n Tổng giai thừa của 4, 5, 7 và 9 là: " +
         * tinhTongGiaiThua(4, 5, 7, 9));
         * phanTichThuaSoNguyenTo(20);
         * System.out.println("\n Mảng ban đầu: ");
         * hienThiMang(a);
         * System.out.println("\n Mảng sau khi sắp xếp theo chiều tăng: ");
         * hienThiMang(sapXepMangTang(a));
         * System.out.println("\n Mảng sau khi sắp xếp theo chiều giảm: ");
         * hienThiMang(sapXepMangTheoChieuGiam(a));
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Nhập số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.print("\n Nhập số thứ hai: ");
        int num2 = sc.nextInt();
        int uscln = timUocSoChungLonNhat(num1, num2);
        System.out.print("\nƯớc số chung lơn nhất của" + num1 + "và" + num2 + "là: " + uscln);
        int bscnn = timBoiSoChungNhoNhat(num1, num2);
        System.out.print("\n Bội số chung nhỏ nhất của" + num1 + "và" + num2 + "là: " + bscnn);

    }

}
