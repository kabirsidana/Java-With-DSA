import java.util.Scanner;
public class Matrix {
    public void process(){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter Matrix Digits -: ");
        int arr[][]=new int[2][5];
        for (i=0;i<2;i++){
            for(j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (i=0;i<2;i++){
            for(j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("|");
        }
    }
    public static void main(String[] args) 
     {
        Matrix matrix = new Matrix();
        matrix.process();
    }
}


