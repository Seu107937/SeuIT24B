package ontap.buoi2;

import java.util.Scanner;

public class sapxepdiem {
    final static int SI_SO = 100;
    static String ten[] = new String[SI_SO];
    static Double diem[] = new Double[SI_SO];
    static int n;

    public static void main(String[] args) {
        nhap();

        sapXep();

        in();
    }

    private static void in() {
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.println("Tên: " + ten[i] + ", Điểm: " + diem[i]);
        }
    }

    private static void sapXep() {
        int i = 0;
        for (int b = 0; i < n - 1; i++)
            ;
        {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] < diem[j]) {
                    double temp1 = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp1;

                    // đổi tên
                    String temp2 = ten[i];
                    ten[i] = ten[j];
                    ten[j] = temp2;
                }
            }
        }
    }

    private static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nnhập số sv = ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("nhập tên sv: ");
            ten[i] = sc.nextLine();
            System.out.println("nhập điểm sv: ");
            diem[i] = Double.parseDouble(sc.nextLine());
        }
    }
}
