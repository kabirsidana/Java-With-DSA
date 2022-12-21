import java.util.Arrays;
public class Rotate1DArray {
    // Rotate an Array ,input -1,2,3,4,5 ,fromElement =2
//output = 3,4,5,1,2

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int fromElement=3;
        int temp[]= new int [arr.length];
        int j=0;
        for(int i=fromElement;i<arr.length;i++){
            temp[j]=arr[i];
            j++;
        }
        System.out.println("Before Rotation "+Arrays.toString(temp));
        for(int i=0;i<fromElement;i++){
            temp[j]=arr[i];
            j++;
        }
        System.out.println("After Rotation "+Arrays.toString(temp));
        
        
    }
}

