package demo.bai4;

public class bai2 {
    public static void main(String[] args) {
        // Toán tử logic java
        int i = 8;
        int j = 5;
        int k = 10;
        System.out.print(" \nkiem tra va: " + (i > 0 && i < 10));
        System.out.print(" \nkiem tra hoac: " + (j > 0 || j < 3));
        System.out.print(" \nkiem tra phu dinh: " + (!(k > 4 || k < 9)));

        // Toán tử tiền tố , hậu tố java
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;
        // kiem tra tang a,b giam c,d
        a++;
        ++b;
        c--;
        --d;
        int e = a++ - ++b + 1;

        System.out.print("\n" + a);
        System.out.print("\n" + b);
        System.out.print("\n" + c);
        System.out.print("\n" + d);
        System.out.print("\n" + e);

    }
}
