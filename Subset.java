import java.util.ArrayList;

class Subset{
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        subset("","321",list);
        System.out.println(list);
    }

    private static void subset(String pd, String upd,ArrayList <String> list) {
        if(upd.isEmpty()){
            if(pd.isEmpty()){
                list.add(null);
                return;
            }
            else{
                list.add(pd);
                return ;
            }
          
        }
        char c=upd.charAt(0);
        subset(pd, upd.substring(1),list); 
        subset(pd+c, upd.substring(1),list);
        // subset(pd+(int)c, upd.substring(1),list);  //for ascii value
    }
    public static void subsetbitwise(int[] arr) {
        int limit=(int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            String set="";
            int temp=i;
            for (int j = arr.length-1; j >=0; j--) {
                int rem =temp%2;
                temp/=2;
                if(rem==0){
                    set="-"+" "+set;
                }
                else{
                    set=arr[j]+" "+set;
                }
            }
            System.out.println(set);
        }
    }
}
