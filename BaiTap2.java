package buoi10;

import java.util.Scanner;

public class BaiTap2 {
    public static void kiemTraTamGiac(long a, long b, long c)
    {
      
        if(a+b>c&&a+c>b&&+c>a)
        {
            if(a==b && b==c)
            {
               System.out.println("Tam giác đều");
            }
            else{
                if(a == b || b == c || a == c)
                {
                    if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b){
                        System.out.println("Tam giác vuông cân");
                    }else{
                        System.out.println("Tam giác cân");
                    }
                } else{
                    if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b){
                        System.out.println("Tam giác vuông");
                    }else{
                        System.out.println("Tam giác thường");
                    }
                }   

                
            }
        }else{
            System.out.println("Các giá trị nhập vào không tạo thành 3 cạnh của tam giác");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        long a = sc.nextLong();

        System.out.print("Nhập cạnh b: ");
        long b = sc.nextLong();

        System.out.print("Nhập cạnh c: ");
        long c = sc.nextLong();

        kiemTraTamGiac(a, b, c);
    }
       
    
}
