// Solid Rectangle Pattern
// *  *  *  *  *    
// *  *  *  *  *  
// *  *  *  *  *  
import java.util.Scanner;
public class Pattern2 {
public void process(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of Rows -: ");
    int rows = sc.nextInt();
    System.out.println("Enter Number of Column -: ");
    int column = sc.nextInt();
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=column;j++){
            System.out.print(" * ");
        }
    System.out.println(" ");
    }
}
public static void main(String[]args){
    Pattern2 pattern2 = new Pattern2();
    pattern2.process();
}
    
    
}
