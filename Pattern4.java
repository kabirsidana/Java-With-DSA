// Inverse Pyramid
//*****
//****
//***
//**
//*
import java.util.Scanner;
public class Pattern4 {
    public void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows ");
        int rows = sc.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
        System.out.println();
        }
    }
    public static void main(String [] args ){
        Pattern4 pattern4 = new Pattern4();
        pattern4.process();
    }
}
