public class MinimumInArray {
    public static void main(String[] args) {
        MinimumInArray m= new MinimumInArray();
        m.process();
    }

    public void process() {
        int [] arr={10,25,4222,66,8,33,453,5445,65,7,657,755};
        int min=arr[0];
        for(int a:arr){
            if(a<min){
                min=a;
            }
        }
        System.out.println(min);
    }
    
}
