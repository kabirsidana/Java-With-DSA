public class Minimum_in_SortedArray {
    public static void main(String[] args) {
        int []arr={3,4,5,6,-7,1,2};
        // int []arr={-8,1,2,3,4,5,6,7};
        System.out.println(findmin(arr));
    }

    private static int findmin(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[end]==arr[mid]){
                return arr[mid];
            }
            else if(arr[end]>arr[mid]){
                end=mid;
            }
            else if(arr[end]<arr[mid]){
                start=mid+1;
            }
        }
        return 0;
    }
}
