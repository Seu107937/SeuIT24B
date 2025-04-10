package ontap.buoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    static ArrayList<String> dssv = new ArrayList<>();

    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        while (true) {
            System.out.println("1. nhap ds sv");
            System.out.println("2. in ds  co ho Nguyen hoac ten Tuan");
            System.out.println("3. in ds sv co ho lot la my");
            System.out.println("0. thoat");

            Scanner sc = new Scanner(System.in);

            System.out.println(" ban chon so may");
            String chon = sc.nextLine();

            switch (chon) {
                case "1":
                    NhapDSSV();
                    break;
                case "2":
                    InDSSVHoNguyenTenTuan();
                    break;
                case "3":
                    inDSSVHoLotMy();
                    break;
                case "0":
                    System.out.println("byeeee");
                    System.exit(0);
                    break;
                default:
                    System.out.println("hay nhap lai");
                    break;
            }

        }
    }

    private static void inDSSVHoLotMy() {
        for (String SV : dssv) {
            if (SV.trim().toLowerCase().contains(" Mỹ ")
                    || SV.trim().toLowerCase().contains(" mỹ")) {
                System.out.println(SV.trim());
            }
        }
    }

    private static void InDSSVHoNguyenTenTuan() {
        for (String SV : dssv) {
            if ((SV.trim().toLowerCase().startsWith("Nguyễn "))
                    || (SV.trim().toLowerCase().startsWith("nguyễn"))
                    || (SV.trim().toLowerCase().endsWith(" Tuấn"))
                    || (SV.trim().toLowerCase().endsWith(" tuấn"))) {
                System.out.println(SV.trim());
            }
        }
    }

    private static void NhapDSSV() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("nhap ho ten (enter == ket thuc nhap)");
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }
            dssv.add(s);
        }
    }
}