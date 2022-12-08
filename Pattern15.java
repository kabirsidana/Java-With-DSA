// Diamond Shape
 
//     *
//    ***
//   *****
//  *******
//  *******
//   *****
//    ***
//     *
public class Pattern15 {
    public void process(int a){
        int rows=a;
        for(int i=1;i<=rows;i++){
            for(int s=1;s<=rows-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ 
                System.out.print("*");
            }
            for(int x=2;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows;i>=1;i--){
            for(int s=1;s<=rows-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ 
                System.out.print("*");
            }
            for(int x=2;x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern15 pattern15 = new Pattern15();
        pattern15.process(4);
    }
}
/*
public class Pattern15 {
    public void process(int a){
        int rows;
        rows=a;
        for(int i=1;i<=rows;i++){
            for(int s=1;s<=rows-i;s++){
                System.out.print(" ");
                            }
                            //2*i-1 Stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows;i>=1;i--){
            for(int s=1;s<=rows-i;s++){
                System.out.print(" ");
                            }
                            //2*i-1 Stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Pattern15 pattern15 = new Pattern15();
        pattern15.process(4);
    }
}
 */