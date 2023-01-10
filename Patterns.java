// Patterns Questions Kunal Kushwaha Github
public class Patterns {
    public static void main(String[] args) {
        int n=5;
        pattern15(n);
    }
    private static void pattern15(int n) {
        for (int i=1;i<=n ;i++ ){
             for (int s=0;s<n-i ;s++ ){
                System.out.print(" "); 
             } 
             for (int j=i;j>0;j--) {
                System.out.print(j); 
        }  
             for (int j=2;j<=i;j++) {
                System.out.print(j); 
        }  
   
        System.out.println();
    }
        n=4;
        for (int i=n;i>0 ;i-- ){
             for (int s=0;s<n-i+1 ;s++ ){
                System.out.print(" "); 
             } 
             for (int j=i;j>0;j--) {
                System.out.print(j); 
        }  
             for (int j=2;j<=i;j++) {
                System.out.print(j); 
        }  
   
        System.out.println();
    }}
    private static void pattern14(int n) {
            for (int i=1;i<=n ;i++ ){
                 for (int s=0;s<n-i ;s++ ){
                    System.out.print(" "); 
                 } 
                 for (int j=i;j>0;j--) {
                    System.out.print(j); 
            }  
                 for (int j=2;j<=i;j++) {
                    System.out.print(j); 
            }  
       
            System.out.println();
        }}

    private static void pattern13(int n) {
        //n=4 DOUBT
        for (int i=1;i<=4 ;i++ ){
         
            for (int j=1;j<=7;j++ ) {
                if( i==4 ||i+j==5||j-i==3 ){
               System.out.print("*"); 
                }
                else{
                    System.out.print(" ");
                }
       } 
  
       System.out.println();
   }}
    private static void pattern12(int n) {
        for (int i=1;i<=n ;i++ ){
             for (int s=0;s<n-i ;s++ ){
                System.out.print(" "); 
             } 
             for (int j=1;j<=n ;j++ ) {
                 if(i==1 || i==n ||j==1 || j==n ){
                System.out.print("*"); 
                 }
                 else{
                     System.out.print(" ");
                 }
        } 
        System.out.println();
    }
   
    }
    private static void pattern11(int n) {
        for ( int i = n; i >0; i--) {
            for (int s = n-i; s >0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for ( int i = 1; i <=n; i++) {
            for (int s = n-i; s >0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    private static void pattern10(int n) {
        for ( int i = 1; i <=n; i++) {
            for (int s = n-i; s >0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    private static void pattern9(int n) {
        for ( int i = 2*n-1; i >0; i-=2) {
            for (int s = n-i/2; s >0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern8(int n) {
        for ( int i = 1; i <= 2*n-1; i+=2) {
            for (int s = n-i/2; s >0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern7(int n) {
        for ( int i = 1; i < n; i++) {
            for (int s = 0; s <i ; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern6(int n) {
        for ( int i = 1; i < n; i++) {
            for (int s = 0; s < n-i; s++) {
                // System.out.println(s);
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for ( int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n) {
        for ( int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void pattern3(int n) {
        for ( int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern2(int n) {
        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
