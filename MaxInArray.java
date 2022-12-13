public class MaxInArray {
    public static void main(String[] args) {
        MaxInArray a= new MaxInArray();
        a.process();
    }

    public void process() {
        // find max in array
        int [] arr={1,2,4,6,8,33,3,5445,65,7,657,755,2};
        int max=arr[0];
        for(int a:arr){
            if(a>max){
                max=a;
            }
        }
        System.out.println(max);
    }
    
}
