//Leetcode 78
import java.util.List;
import java.util.ArrayList;
class ArraySubset{
    public static void main(String[] args) {
        List<List<Integer>> powerset = new ArrayList<>(); //powerseet
        List <Integer> empty= new ArrayList<>();//empty set
        powerset.add(empty);//adding empty set in powerset
        int arr[]={1,2,2};
        subset(arr,powerset);
        System.out.println(powerset);
    }

    public static void subset(int[] arr, List<List<Integer>> powerset) {
        for (int num : arr) {
            int n=powerset.size();//we will take a variable because size will increase with iteration
            for (int i = 0; i <n; i++) {
                List <Integer> temp = new ArrayList<>(powerset.get(i)); // initialize with previous data
                temp.add(num);// merge num with previous data 
                powerset.add(temp); // add to main powerset
            }
        }
    }
}