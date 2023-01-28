import java.util.Arrays;
class MergeSort{
public static void main(String[] args) {
   int arr[] ={6,5,4,3,2,1};
    int [] a= mergesort(arr);
    System.out.println (Arrays.toString(a));
}

private static int[] mergesort(int[] arr) {
    if(arr.length==1){
        return arr;
    }
    int mid=arr.length/2;
    int [] left =mergesort(Arrays.copyOfRange(arr, 0, mid));
    int [] right =mergesort(Arrays.copyOfRange(arr, mid, arr.length)); 
    // not mid+1 because it exclude the upper limit
    return merge(left,right);// now we have to merge left and right
}

private static int[] merge(int[] left, int[] right) {
    int [] ans =new int[left.length+right.length];
    int i=0;//left
    int j=0;//right
    int k=0;//ans
    while(i<left.length && j<right.length){
        if(left[i]>right[j]){
            ans[k]=right[j];
            j++;
        }
        else {
            ans[k]=left[i];
            i++;
        }
        k++;
    }
    // for remaining elements
    while(i<left.length){
        ans[k]=left[i];
        i++;k++;
    }
    while(j<left.length){
        ans[k]=right[j];
        j++;k++;
    }
    return ans;
}

}