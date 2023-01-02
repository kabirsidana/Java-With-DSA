import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2,6};
        // if we pass a sorted array , it will still run for n-1 times 
        // int arr[]={1,2,3,4,5,6};
        bubble(arr);
    }

    private static void bubble(int[] arr) {
        boolean ifsorted=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    ifsorted=true;
                }
            }
            if(ifsorted==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
