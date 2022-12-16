import java.util.Arrays;

/*
Q. Rotate an 2D  Array 90 Degree
    |1,2,3|
    |4,5,6|
    |7,8,9|
 Step 1 - Transpose 
    |1,4,7|
    |2,5,8|
    |3,6,9|
 Step 2 - make column 0 -> column 2 
        - make column 2 -> colum n 0 
*/  

public class ArrayRotate {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
       
        rotatearray(arr);
        
    }
    public static void rotatearray(int[][] arr) {
        int [][] transpose= new int [arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    transpose[i][j]=arr[j][i];
                }   
            }
            for (int i = 0; i < transpose.length; i++) {
                System.out.println(transpose [i][transpose.length-1]);
                int temp=transpose[i][0];
                transpose[i][0]=transpose[i][transpose.length-1];
                transpose[i][2]=temp;
                // =transpose[i][2];
            }
            System.out.println(Arrays.deepToString(transpose));
    }

}
