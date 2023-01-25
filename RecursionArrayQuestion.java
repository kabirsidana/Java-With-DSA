import java.util.ArrayList;

public class RecursionArrayQuestion {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        // sortedornot(arr);
        // findtarget(arr,18,0);
        // occurance(arr,3,0); //print arraylist 
        // occurance2(arr,3,0,new ArrayList<>()); //arraylist as argument
        occurance3(arr,3,0); //arraylist inside function
    }
    private static ArrayList <Integer> occurance3(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList <Integer> ans= occurance3(arr,target,++index);
        list.addAll(ans);
        return list;

    }
    private static ArrayList<Integer> occurance2(int[] arr,int target,int index,ArrayList<Integer> list) {
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return occurance2(arr,target,++index,list);
    }

    static ArrayList <Integer> list= new ArrayList<Integer>();
    private static void occurance(int[] arr,int target,int index) {
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        occurance(arr,target,++index);
    }
    private static int findtarget(int[] arr, int target, int index) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findtarget(arr,target,++index);
    }
    static int count=0;
    private static boolean sortedornot(int[] arr) {
        if(count==arr.length-1){
            return true;
        }
        if(arr[count]<=arr[count+1]){
            count++;
            return sortedornot(arr);
        }
        return false;
        
    }
}
