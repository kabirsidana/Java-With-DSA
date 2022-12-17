import java.util.Arrays;

// Method 1 

// public class ReverseArray {
//     public static void main(String[] args) {
//         ReverseArray r = new ReverseArray();
//             r.process();
//     }

//     public void process() {
//         int [] arr= {9,8,7,6,5,4,3,2,1,0};
//         int temp[]= new int [10];
//         for(int i=0;i<arr.length;i++){
//             temp[i]=arr[(arr.length-1)-i];
//         }
//         System.out.println(Arrays.toString(arr));
//         arr=temp;
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Method 2 - With the help of Swap

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
            r.process();
    }

    public void process() {
        int [] arr= {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[0+i];
            arr[0+i] =arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
 
