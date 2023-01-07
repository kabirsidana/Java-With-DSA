// import java.util.Arrays;
// class cyclicSort 
// {
//     public static void main(String[] args) {
//        int arr[]={5,3,2,1,4,6};
//        // we have to put at correct Index
//        for(int i=0;i<arr.length;i++){
//        int correct =arr[i]-1;
//        if(arr[i]!=arr[correct]){
//            int temp=arr[i];
//            arr[i]=arr[correct];
//            arr[correct]=temp;
//        }
//        }
//     System.out.println(Arrays.toString(arr));
//     }
// }

//  METHOD 2

import java.util.Arrays;
class CyclicSort {
    public static void main(String[] args) {
        int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1};
        int i = 0;
        while (i < arr.length) {
            // correct Index
            int correct = arr[i] ;
            if (arr[i]<arr.length && arr[i] != i ) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
             else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
