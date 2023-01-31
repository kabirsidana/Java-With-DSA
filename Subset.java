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
}