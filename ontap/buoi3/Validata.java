package ontap.buoi3;

import java.util.Scanner;

public class Validata {
    static String maNV, matKhau, hoTen, email, soDT, soCMND, soXe, web;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhap ma nv
        while (true) {
            System.out.println("nhập mã nhân viên (5 ký tự in hoa): ");
            maNV = sc.nextLine();

            String maNVRegex = "[A-Z]{5}";
            if (maNV.matches(maNVRegex)) {

                break;
            }
        }

        // nhap mat khau
        while (true) {
            System.out.println(" nhập mật khẩu ít nhất 6 ký tự: ");
            matKhau = sc.nextLine();

            String matKhauRegex = ".{6,}";
            if (matKhau.matches(matKhauRegex)) {
                break;
            }
        }

        // nhap ho ten
        while (true) {
            System.out.println(" Nhập họ và tên, chỉ dùng alphabet và ký tự trắng:");
            hoTen = sc.nextLine();

            String hoTenRegex = "[a-zA-Z ]+";
            if (hoTen.matches(hoTenRegex)) {
                break;
            }
        }

        // nhap email
        while (true) {
            System.out.println(" Nhập email: ");
            email = sc.nextLine();

            String emailRegex = "^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,3}$";
            if (email.matches(emailRegex)) {
                break;
            }

        }

        // nhap dien thoai
        while (true) {
            System.out.println("Nhập số điện thoại: ");
            soDT = sc.nextLine();

            String soDTRegex = "^0[0-9]{9,10}$";
            if (soDT.matches(soDTRegex)) {
                break;
            }
        }
        // nhap CMND
        while (true) {
            System.out.println("Nhập số CMND: ");
            soCMND = sc.nextLine();

            String soCMNDRegex = "^[0-9]{9}|[0-9]{12}$";
            if (soCMND.matches(soCMNDRegex)) {
                break;
            }
        }
        // nhap so xe may
        while (true) {
            System.out.println("Nhập số xe máy: ");
            soXe = sc.nextLine();

            String soXeRegex = "^[A-Za-z0-9\\s]+$";
            if (soXe.matches(soXeRegex)) {
                break;
            }
        }
        // nhập địa chỉ web
        while (true) {
            System.out.println("Nhập địa chỉ web: ");
            web = sc.nextLine();

            String webRegex = "^(https?:\\/\\/)?([\\w\\-]+\\.)+[\\w\\-]{2,4}(\\/.*)?$";
            if (web.matches(webRegex)) {
                break;
            }
        }

    }

}
