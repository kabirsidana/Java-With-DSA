public class FirstAndLastOccuranceSortedArray { 
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,6,7,8,9};
        int target=10;
       int first= firstOccurance(arr,target);
        int last =lastOccurance(arr,target);
        System.out.println(first +" and "+last);
    }

    private static int lastOccurance(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int first=-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]==target){
                first=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
        }
        return first;
    }

    private static int firstOccurance(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int first=-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
        }
        return first;
    }
}
