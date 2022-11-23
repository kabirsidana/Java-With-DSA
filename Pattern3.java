//Hollow Rectangle
// *****
// *   *
// *   *
// *****
import java.util.Scanner;
public class Pattern3 {
    public void process(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows=sc.nextInt();
        System.out.println("Enter Number of Column");
        int column=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                if(i==1||i==rows || j==1 || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
public static void main(String [] args){
    Pattern3 pattern3 = new Pattern3();
    pattern3.process();
}
    
}
