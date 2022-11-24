//half pyramid with Numbers
//1
//12
//123
//1234
//12345
//123456

import java.util.Scanner;
public class Pattern6 {
    public void process(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
       for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
       }

    }
    public static void main(String[] args) {
        Pattern6 pattern6 = new Pattern6();
        pattern6.process();
    }
    
}
