public class SquareRoot {


    // Method 1
    // public static void main(String[] args) {
    //     int n=144;
    //     int i=1;
    //     int count=0;
    //     System.out.println(Math.sqrt(n));
    //   while(n>0){
    //       n= n-i;
    //       count++;
    //       i=i+2;
    //   }
    //   System.out.println(count);
    // }


    //Method 2
//     public static void main(String[] args) {
//         int n=1443;
//         for (int i = 1; i <n/2; i++) {
//             if(i*i==n){
//                 System.out.println("Square root is "+i);
//                 break;
//             }
//         }
        
//     }
    
// }

// Method 3 Binary Search
public static void main(String[] args) {
    int n=256;
    long start=1;
    long end=n;
    while(start<=end){
        long mid=(start+end)/2;
        if(mid*mid<n){
            start=mid+1;
        }
        if(mid*mid>n){
            end=mid-1;
        }
        if(mid*mid==n){
            System.out.println(" The Answer is "+mid);
            break;
        }
    }
}}