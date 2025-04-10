package ontap.buoi1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthButtonUI;

public class deMoMenu {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("=========menu========");
        System.out.println("1. thuc hien phep cong");
        System.out.println("2. thuc hien phep tru");
        System.out.println("3. thuc hien phep nhan");
        System.out.println("4. thuc hien phep chia");
        System.out.println("0. thoat");
        System.out.println("=======================");
        System.out.println("moi ban chon so");

        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        switch (chon) {
            case 1: {
                thucHienPhepCong();
                break;
            }
            case 2: {
                thucHienPhepTru();
                break;
            }
            case 3: {

            }
            case 4: {
                System.out.println("chuc nang dang xay dung");
                break;

            }
            case 0: {
                System.out.println("byeeeeee");
                System.exit(0);
                break;

            }
            default:
                System.out.println("ban chon sai moi nhap lai so!!!");

        }
    }

    private static void thucHienPhepCong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println(" nhap so b");
        int b = sc.nextInt();
        System.out.println("ket qua " + (a + b));

    }

    private static void thucHienPhepTru() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println(" nhap so b");
        int b = sc.nextInt();
        System.out.println("ket qua " + (a - b));

    }

    private static void thucHienPhepNhan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println(" nhap so b");
        int b = sc.nextInt();
        System.out.println("ket qua " + (a * b));

    }

    private static void thucHienPhepChia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println(" nhap so b");
        int b = sc.nextInt();
        System.out.println("ket qua " + (a / b));
        if (b != 0) {
            System.out.println("Kết quả: " + ((double) a / b));
        } else {
            System.out.println("Không thể chia cho 0.");
        }

    }

}
