package ontap.buoi2;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap user: ");
        String user = sc.nextLine();
        System.out.println("nhap pass: ");
        String pass = sc.nextLine();

        if (user.equalsIgnoreCase("hello") && pass.length() > 6) {
            System.out.println(" dang nhap thanh cong");
        } else {
            System.out.println("dang nhap that bai");
        }
    }
}
