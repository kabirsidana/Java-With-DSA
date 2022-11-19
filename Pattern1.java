// Half Pyramid / Straight Pyramid
//* 
//**
//***
//****
//*****
//******
import java.util.Scanner;
public class Pattern1 {
    public void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows of Pyramid");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++){
            for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }
    public static void main(String []args){
        Pattern1 pattern1 = new Pattern1();
        pattern1.process();
    }
    
}
