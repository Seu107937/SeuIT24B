package buoi9;

public class Buoi9 {
    public static void tamGiacSao(int n)
    {   
         System.out.println();
         for (int i=1; i <= n; i++)
          {
            for ( int j=1; j <= i; j++)
            {
            System.out.print("* ");
            }
           System.out.println();
        }
    }

    public static void tamGiacSaoNguoc(int n)
    {   
        System.out.println();
       for (int i=n; i >= 1; i--){
        
        for ( int j=1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void tamGiacSo(int n)
    {   
      System.out.println();
      for (int i=1; i <= n; i++){
            
        for ( int j=1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void tamGiacSoNguoc(int n)
    {   
      System.out.println();
      for (int i=n; i >= 1; i--){
            
        for ( int j=1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void kimTuThap(int n)
    {   
      System.out.println();
      for (int i = 1; i <= n; i++){

         for ( int j = 1; j <= n - i; j++)

            {
             System.out.print( "  ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        
        }
    }
    public static void kimTuThapNguoc(int n)
    {
        
      for (int i = n; i >=1; i--){

         for ( int j = 1; j <= n - i; j++)

            {
             System.out.print( "  ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        
        }
    }

    
    public static void kimTuThapSo(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int k=1; k<(2*i)/2; k++)
            {
                System.out.print(k + " ");
            }
            for(int l=(2*i)/2; l>=1; l--)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    public static void kimTuThapSoNguoc(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < (2 * i) / 2; k++) {
                System.out.print(k + " ");
            }
            for (int l = (2 * i) / 2; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    
          
    

    public static void main(String[] args) {
        System.out.println("\nTam giác sao");
        tamGiacSao(5);
        System.out.println("\nTam giác sao ngược");
       tamGiacSaoNguoc(5);
       System.out.println("\nTam giác số");
        tamGiacSo(5);
        System.out.println("\nTam giác số ngược");
        tamGiacSoNguoc(5);
        System.out.println("\nKim tự tháp");
       kimTuThap(5);
       System.out.println("\nKim tự tháp ngược");
       kimTuThapNguoc(5);
       System.out.println("\nKim tự tháp số");
       kimTuThapSo(5);
       System.out.println("\nKim tự tháp số ngược");
       kimTuThapSoNguoc(5);
    }

}
