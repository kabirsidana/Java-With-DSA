// we have to count number of times array is being rotated
// ex        0,1,2,4,5,6,7
// rotated   4,5,6,7,0,1,2
// pivot is equal to number of rotation
public class ArrayRotationCount {
    public static void main(String[] args) {
        int []arr={4,5,6,7,8,0,1,2};
        findrotation(arr);
    }

    private static void findrotation(int[] arr) {
        int start =0;int end=arr.length-1;
    while(start<end){
            int mid=start+(end-start)/2;
            if(arr[end]<arr[mid]){
                start=mid+1;
            }
            else if(arr[end]>arr[mid]){
                end=mid;
            }
        }
        System.out.println("The Number of Rotations is "+end);

    }
    
}
