// modified binary search , check if array is ascending or descending
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 21, 17, 16, 14, 13, 12, 7, -3, -5 };
        System.out.println(searchbinary(arr, 7));
    }

    private static int searchbinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[0] < arr[1]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                }
            }
        }
        else{
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]< target){
                    end=mid-1;
                }
                if(arr[mid]>target){
                    start=mid+1;               
                }
            }
        }

        return -1;
    }
}
