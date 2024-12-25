package buoi12;

import java.util.Scanner;

public class Buoi12 {
    // Bài 3. Viết chương trình tính tổng các số chẵn từ 2 đến N (nguyên dương, nhập
    // từ bàn
    // phím).

    // nhập số nguyên dương từ bàn phím
    public static int nhapSoNguyen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập giá trị: ");
                int num = Integer.parseInt(sc.next());
                sc.close();
                return num;

            } catch (Exception e) {
                System.out.println("Dữ liệu không hợp lệ hay nhập lại!!");
            }
        }
    }

    public static int timTongChan(int n) {
        int tong = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }
        return tong;
    }
    // Bài 14. Viết chương trình có định nghĩa hàm tìm giá trị lớn nhất trong 3 số
    // nguyên cho
    // trước.

    public static int timGiaTriLonNhatBaSo(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    // Bài 27. Số hoàn hảo là số bằng tổng các ước thực sự của nó. Ví dụ: 6 = 1+2+3.
    // Viết chương
    // trình kiểm tra số nguyên dương n nhập vào từ bàn phím có phải là số hoàn hảo
    // không.
    public static boolean kiemTraSoHoanHao(int n) {
        int tong = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;
    }

    public static void hienThiUocSoHoanHao(int n) {
        int tong = 0;
        if (kiemTraSoHoanHao(n)) {
            System.out.printf("%d là số hoàn hảo và các ước số của %d là: ", n, n);
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.print("\t" + i);
                    tong += i;
                    if (tong == n)
                        break;
                }
            }
        } else
            System.out.printf("%d không phải là số hoàn hảo!", n);

    }

    // Bài 30. Số đối xứng (Palindrome) là số nhận được khi thực hiện đảo ngược các
    // chữ số của
    // nó cho kết quả bằng số ban đầu. Ví dụ: 121, 3553.Viết chương trình kiểm tra
    // số nguyên
    // dương n nhập vào từ bàn phím có phải là số đối xứng (Palindrome) không. Nếu
    // đúng thì
    // hiển hiện thông báo “Số vừa nhập là số đối xứng”, ngược lại hiển thị thông
    // báo “Số vừa
    // nhập không phải là số đối xứng”.
    public static boolean kiemTraSoDoiXung(int num) {
        int sbd = num, sdx = 0;
        while (num != 0) {
            int tam = num % 10;
            sdx = sdx * 10 + tam;
            num /= 10;

        }
        return sdx == sbd;
    }

    public static void soDoiXung(int num) {
        if (kiemTraSoDoiXung(num))
            System.out.printf("%d là số đối xứng!", num);
        else
            System.out.printf("%d không phải là số đối xứng!", num);
    }

    // viét chương trình nhập vào một số từ bàn phím và hện thị số đảo ngược
    public static void hienThiSoDaoNguoc(int num) {
        System.out.printf("Đảo ngược của số %d ta được ", num);
        while (num != 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }

    public static void main(String[] args) {
        int tam = nhapSoNguyen();
        System.out.printf("Tổng các số chắn từ 2 đến %d là %d", tam,
                timTongChan(tam));
        int a = -10, b = -12, c = 4;
        System.out.printf("\n Giá trị lớn nhất của ba số %d, %d và %d là %d", a, b,
                c, timGiaTriLonNhatBaSo(a, b, c));
        hienThiUocSoHoanHao(tam);
        soDoiXung(tam);
        hienThiSoDaoNguoc(tam);
    }
}
