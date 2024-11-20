package buoi10;

public class BaiTap19_20 {
    public static boolean kiemTraNguyenTo(int n)
    {
        boolean nt = true;
        if ( n == 0 || n == 1)
            return false;
        int i = 2;
        int tam = (int) Math.sqrt(n);
        while (i <= tam) {
            if ( n % i == 0){
                nt = false;
                break;
            }
            i++;
        }    
        return nt;
        
    }
    // liệt kê các số nguyên tổ nhỏ hơn n cho trước
    public static void bai19(int n)
    {
        for(int i=1; i<n; i++)
        {
            if(kiemTraNguyenTo(i) == true)
               System.out.print(i + "\t");
        }
    }
    // liệt kê n số nguyên đầu tiên 
    public static void bai20(int n){

        int dem = 0;
        for (int i = 1;; i++){
            if (dem == n)
            break;
        else {
             if (kiemTraNguyenTo(i) == true){
                 System.out.print(i + "\t");
                 dem += 1;

                }

            }
        }
    }
    
    
        
      
    





    public static void main(String[] args) {
        //System.out.println("\nHiển Thị Các Số Nguyên Tố Nhỏ Hơn n Cho Trước: ");
        //bai19(10);
        System.out.println("\nHiển thị n số nguyên đầu tiên : ");
        bai20(5);
        
        
    }
    
}
