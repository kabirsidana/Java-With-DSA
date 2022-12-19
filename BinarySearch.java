class BinarySearch{
    public static void main(String[] args) {
        // the array should be sorted
    int [] arr={2,4,6,9,11,12,14,20,36,48};
    int start =0;
    int end=9;
    int target=20;
    System.out.print("the index values is "+binary(arr,start,end,target));
    }
    public static int binary(int []arr,int start,int end , int target){
        if(end>=start){
            int mid=( start+end )/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return binary(arr,start,mid-1,target);
                // end=mid-1;
            }
          
             if (arr[mid]<target){
                return binary( arr,mid+1,end,target);
                // start =mid+1;
            }
        }
    return -1;
    }
}