public class RecursionQuestions {
    public static void main(String[] args) {
        // gcd(72, 12);
        // print(10);
        // reverse(10); //important
        // fact(5);
        // sum(10);
        // sumofdigits(19289);
        // productofdigits(19289);
        // reversenumber(1345);
        // palindrome(1234);
        numberOfSteps(8); //leetcode 1342
    }

        public static int numberOfSteps(int num) {
            return steps(num,0);
          }
           private static int steps(int num,int count) {
              if(num==0){
                  return count;
              }
              if(num%2==0){
                  return steps(num/2,++count);
              }
              return steps(--num,++count);
          }
    

    static int sum=0;
    private static boolean palindrome(int n) {
            if(n>0){
            sum=(sum*10)+n%10;
            palindrome(n/10);
            }
            if(sum==n){
                return true;
            }
            return false;
    }

    private static void reversenumber(int n) {
    // we can also do it by taking static variable outside the function
        if(n==0){
            return;
        } 
        System.out.print(n%10);
        reversenumber(n/10);
    }


    private static int productofdigits(int n) {
        if(n==0){
            return 1;
        } 
        return n%10*productofdigits(n/10);
    }

    private static int sumofdigits(int n) {
        if(n==0){
            return 0;
        } 
        return n%10+sumofdigits(n/10);
    }

    private static int sum(int n) {
        // sum of numbers from 1:n
        if(n<=1){
            return 1;
        } 
        return n+sum(n-1);

    }

    private static int fact(int n) {
        if(n<=1){
            return 1;
        } 
        return n*fact(n-1);
    }

    private static void print(int n) {
        //print number from 1:n
        if(n>0){
            reverse(n-1);
            System.out.println(n); // printing after the
        }
    }

    private static void reverse(int i) {
        if(i>0){
            System.out.println(i);
            reverse(i-1);
        }
    }

    private static int gcd(int a, int b) {
        //find gcd/hcf of 2 number
       if(a==0){
        return b;
       } 
       return gcd(b%a,a);
    }
    
}
