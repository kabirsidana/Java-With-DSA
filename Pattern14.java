// Palindromic Pattern/Pyramid
//      1
//     212
//    32123
//   4321234
//  543212345
public class Pattern14 {
    public void process(int a){
        int rows=a;
        for(int i=1;i<=rows;i++){
            for(int s=1;s<=rows-i;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);}
                for(int x=2;x<=i;x++){
                    System.out.print(x);
                }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern14 pattern14 = new Pattern14();
        pattern14.process(5);
    }
} 
    
