// import java.util.Scanner;
//1 
//0  1
//1  0  1
//0  1  0  1
//1  0  1  0  1
public class Pattern9 {
    public void process(int a){
        int rows;
        rows=a;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Pattern9 pattern9 = new Pattern9();
        pattern9.process(5);
    }
}
