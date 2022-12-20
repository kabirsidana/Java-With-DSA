// Video -> KunalKushwaha Mathematics for DSA
// In an Array Find the digit which doesnot repeat itself 
// ex [2,3,2,4,5,3,4] // 5 is present Only once

// Logic -> a XOR a=0 , if we Xor all values with each other they will cancel out and
// we will left with the answer. like [-2,3,2-3] they will cancel each other
public class DSAQuestion {
    int unique_var=0;
    public void process(){
        int [] arr = {2,4,7,4,3,2,3};
            for(int j=0;j<arr.length;j++){
//unique =0 , a^0=a then a^a=0 and all similar will get canceled out.
                unique_var^=arr[j];
    }
    System.out.println("the unique values is -> "+unique_var);
}
public static void main(String[] args) {
    DSAQuestion q = new DSAQuestion();
    q.process();
}
}
