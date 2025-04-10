package ontap.buoi8.DemoQuanLy;

public class App {
    public static void main(String[] args) {
        NhanVienSX nvSX = new NhanVienSX("Nguyen Van Anh", 5, 1000, 50000, 200);
        NhanVienVP nvVP = new NhanVienVP("Nguyen Van Em", 3, 2000, 60000, 30000, 2);

        System.out.println(nvSX.toString());
        System.out.println("Luong: " + nvSX.getLuong() + "\n");

        System.out.println(nvVP.toString());
        System.out.println("Luong: " + nvVP.getLuong() + "\n");
    }
}
