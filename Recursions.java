public class Recursions {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 7, 8, 9 };
        // System.out.println(fib(4));
        // System.out.println(bs(arr, 9, 0, arr.length - 1));
        // System.out.println(fact(5));
        // System.out.println(rev("kabir"));
        // cd(5);
    }

    // --- Binary Search with Recursion ---

    public static int bs(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return bs(arr, target, 0, mid - 1);
        }
        return bs(arr, target, mid + 1, arr.length - 1);
    }

    // --- Fibonacci with Recursion ---

    public static int fib(int n) {
        if (n < 2) {

            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
    
    // --- Factorial with Recursion
    
    public static int fact(int n){
        if(n==1){
            return n;
        }
        return n*fact(n-1);
        
    }

    // Reverse a String with Recursions
    public static String rev(String s){
        String ans="";
        for (int i = s.length()-1; i >=0; i--) {
            ans=ans+s.charAt(i);
        }
        return ans;
    }

    // Print CountDown with Recursion
    public static void cd(int s){
        for (int i = s; i >=0; i--) {
            System.out.println(i);
        }
    }

   

}
