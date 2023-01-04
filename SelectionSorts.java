// import java.util.Arrays;
// class SelectionSorts{
//     public static void main(String[] args) {
//         int nums[]={8,6,7,4,5,1,2,3};
//         selectionsort(nums);
//     }
//     private static void selectionsort(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             int max=i;
//             max=findmin(nums,i,max);
//             swap(nums,i,max);
//         }
//         System.out.println(Arrays.toString(nums));
//     }

//     private static void swap(int[] nums, int i, int max) {
//         int temp=nums[i];
//         nums[i]=nums[max];
//         nums[max]=temp;
//     }

//     private static int findmin(int[] nums, int i,int max) {
//         for (int j = i; j < nums.length; j++) {
//             if(nums[j]<nums[max]){
//                 max=j;
//             }
//         }
//         return max;
//     }
// }


// Method 2 -> With Max Number


import java.util.Arrays;
class SelectionSorts{
    public static void main(String[] args) {
        int nums[]={8,6,7,4,5,1,2,3};
        selectionsort(nums);
    }
    private static void selectionsort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max=i;
            int last=nums.length-1-i;
            max=findmax(nums,last);
            swap(nums,last,max);
        }
        System.out.println(Arrays.toString(nums));
    }


    private static void swap(int[] nums, int last, int max) {
        int temp=nums[last];
        nums[last]=nums[max];
        nums[max]=temp;
    }

    private static int findmax(int[] nums, int last) {
        int max =0;
        for (int j = 0; j <= last; j++) {
            if(nums[j]>nums[max]){
                max=j;
            }
        }
        return max;
    }
}