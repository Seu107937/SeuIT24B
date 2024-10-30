package buoi7;
import java.util.Scanner;
public class Buoi7 {
    public static int nhapSoNguyen() {
     Scanner sc = new Scanner(System.in);
     int n = 0;
     while (true) {
        try {
            System.out.println("\nHãy nhập giá trị: ");
            n = Integer.parseInt(sc.nextLine());
            break;
    } catch (Exception ex) {
        // TODO: handle exception
        System.out.println("Dữ liệu không hợp lệ, hãy nhập lại !!!");
    }

} 
return n;
}
// Nhập điểm và kiểm soát dữ liệu dầu vào 
public static float nhapDiem() 
{
    float diem = 0;
    Scanner sc = new Scanner(System.in);
    while(true)
{
    try {
        System.out.println("\nNhập điểm: ");
        diem = Float.parseFloat(sc.nextLine());
        if(diem >= 0 && diem <= 10)
           break;
        else
        {
            System.out.println("Điểm không hợp lệ, giá trị nằm trong khoảng 0-10");
        }
    } catch (Exception ex) {
        // TODO: handle exception
        System.out.println("Dữ liệu không hợp lệ, giá trị nằm trong khoảng 0-10, hãy nhập lại !!!");
    }
}
return diem;
}
//Demo code ví dụ 9/slide 62/chương 3
public static void hienThiMangBaChieu()
{
    int arr3[][][] = {{{1,2,3},{4,5,6},{7}},{{5,6,7},{8,9}}};
    System.out.println("Danh sách phần tử của mảng arr3 là: ");
    for(int i=0; i<arr3.length; i++)
    {
        for(int j=0; j<arr3[i].length; j++)
        {
            for (int k=0; k<arr3[i][j].length; k++)
            {
            System.out.printf("arr3[%d][%d][%d] = %d\t",i,j,k, arr3[i][j][k]);
            }
        }
        System.out.println();
    }

}
    public static void main(String[] args) {
/*      int tam = nhapSoNguyen();
      System.out.printf("Dành sách các phần tử nhỏ hơn hoặc bằng %d là: " + tam);*/
      /*float diem = nhapDiem();
      System.out.println("Điểm vừa nhập là: " + diem);*/
      hienThiMangBaChieu();
    }
}

    

