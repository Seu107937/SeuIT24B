package demo.bai1;

public class GoiDongVat {
    public static void main(String[] args) {
        // Tạo đối tượng chó
        ConCho dv1 = new ConCho();
        // và gọi các phương thức của chó
        dv1.an();
        dv1.ngu();
        dv1.thucAn();
        dv1.ten();
        dv1.keu();
        dv1.choChay();
        // xuất ra dòng phân cách giữa chó và mèo
        System.out.println("===================================");
        // Tạo đối tượng mèo
        ConMeo dv2 = new ConMeo();
        // và gọi các phương thức của mèo
        dv2.an();
        dv2.ngu();
        dv2.thucAn();
        dv2.ten();
        dv2.keu();
        dv2.choChay();

    }
}
