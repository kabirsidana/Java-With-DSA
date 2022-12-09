import java.util.Arrays;
public class SwapInArray {
    public static void main(String[] args) {
        SwapInArray s= new SwapInArray();
        //Index we want to swap
        s.process(0,4);
    }
    public void process(int i, int j) {
        int [] arr={8,9,10,11,12};
        System.out.println("BEFORE SWAP");
        System.out.println(Arrays.toString(arr));
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        System.out.println("AFTER SWAP");
        System.out.println(Arrays.toString(arr));
    }
    
}
