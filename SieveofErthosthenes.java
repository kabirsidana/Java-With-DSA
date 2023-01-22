//SC O(n)
//TC O(n*log(logn))
public class SieveofErthosthenes {
    public static void main(String[] args) {
        int n=41;
        boolean [] b = new boolean[n+1]; //starts from zero
        sieve(n,b);
    }

    private static void sieve(int n, boolean [] b) {
        for (int i = 2; i*i<=n; i++) // run till the square root
        {
            if(b[i]==false) // all values in boolean array are false by default
            {
                for (int j = i+i; j<=n; j+=i) {
                    b[j]=true;
                }
            }
        }
        for (int i = 2; i < b.length; i++) {
            if(b[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}
