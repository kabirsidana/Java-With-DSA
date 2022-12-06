// Number Pyramid
//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4
//5 5 5 5 5
public class Pattern13 {
    public void process(int a){
        int rows=a;
        for(int i=1;i<=rows;i++){
            for(int s=1;s<=rows-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ 
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern13 pattern13 = new Pattern13();
        pattern13.process(5);
    }
} 
    
