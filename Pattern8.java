//Floyd's Triangle
//  1
//  2 3
//  4 5 6
//  7 8 9 10
//  11 12 13 14 15
import java.util.Scanner;
public class Pattern8 {
    public void process(){
        Scanner sc = new Scanner(System.in);
        int counter=0;
        System.out.println("Enter Number ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                 counter++;
                System.out.print((counter+" "));
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Pattern8 pattern8 = new Pattern8();
        pattern8.process();
    }
}
