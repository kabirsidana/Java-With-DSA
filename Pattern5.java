// 180 Degree Rotated Inverted Half Pyramid 
//    *
//   **
//  ***
// ****
import java.util.Scanner;
public class Pattern5 {
    public void process(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Number of Rows -: ");
 int rows= sc.nextInt();
 //Outer Loop
 for (int i=1;i<=rows;i++){
    //Loop for Space
    for(int s=rows;s>i;s--){
        System.out.print(" ");
    }
    //Loop for Star
    for(int j=1;j<=i;j++){
        System.out.print("*");
   
    }
    System.out.println();
}
}  


    public static void main(String[] args) {
        Pattern5 pattern5 = new Pattern5();
        pattern5.process();
    }
}
 // --- Method 2---

 /*
  * 
import java.util.Scanner;
public class Rough  {
    public void process(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Number of Rows -: ");
 int rows= sc.nextInt();
 for(int i=1;i<=rows;i++){
     for(int s=1;s<=rows-i;s++)
           System.out.print(" ");          
       for(int j=1;j<=i;j++){
            System.out.print("*");
 }
    System.out.println();
}
}  

    public static void main(String[] args) {
        Rough pattern5 = new Rough();
        pattern5.process();
    }
}


  */
