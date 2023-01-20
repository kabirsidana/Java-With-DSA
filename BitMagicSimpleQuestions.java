public class BitMagicSimpleQuestions {
    public static void main(String[] args) {
        int arr[]={44,5,33,33,2,5,44};
        // evenodd(44);
        // uniquenumber(arr);
        // bitvalue(18,3);
        // changebit(15,3);
        // resetbit(15,2);
        // firstsetbit(32);
        // magicnumber(6,5);
        // findbase(128,2);
        // powerof2(68);
        // totalsetbits(347878);
    }

    private static void totalsetbits(int n) {
        //method 1 -> count and right shift 
        System.out.println(Integer.toBinaryString(n));
        //method 2 (min)
        int count=0;
        while(n>0){
            n -=(n&(-n));
            count++;
        }
        System.out.println(count);

    }

    private static void powerof2(int n) {
        //check if the number is power of 2 or not
            int ans = (n & (n-1));
            if(ans==0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
    }

    private static void findbase(int n, int base) // ex. base 2 for binary , 10 for decimal
    {
        int ans =(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }

    private static void magicnumber(int n,int i) {
        // print the nth magic number according to the base
        int base=5;
        int ans=0;
        while(n>0){
            int temp =n&1;
            n=n>>1;
            ans+=temp*base;
            base=base*5;
        }        
        System.out.println(ans);
    }

    private static void firstsetbit(int n) {
        // find the right most set bit
         // Method 1 Right Shift and count
         int count=1;
         while(n>0){
            if((n&1)==1){
                System.out.println(count);
                break;
            }
            else{
                n=n>>1;
                count++;
            }
         }
    }

    private static void resetbit(int n, int i) {
           // reset the ith bit to zero 0->0 1->0
           int ans=(n&~(1<<(i-1)));
           System.out.println(ans);
    }

    private static void changebit(int n, int i) {
        // set the ith bit 0->1  1->0  reverse
        int ans = n^(1<<(i-1));
        System.out.println(ans);
    }

    private static void bitvalue(int n,int i) {
        // find i th bit is 0 or 1 

        //method 1
        // int ans= 1&(n>>i);

        //method 2
        int ans=(n&(1<<(i-1)))>>(i-1);
        System.out.println(ans);
    }

    private static void uniquenumber(int [] arr) {
        // law of associavity 
        // 0^a=a
        // a^a=0
        int ans=0;
        for ( int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        System.out.println(ans);

    }

    private static void evenodd(int n) {
        // Find Number is Even or Odd
        if((n&1)==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
