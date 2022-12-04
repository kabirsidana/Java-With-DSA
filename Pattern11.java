// Solid Rhombus
//      *****
//     *****
//    *****
//   *****
public class Pattern11 {
    public void process(int a){
        int rows=a;
        for(int i=1;i<=rows;i++){
            for(int s=1;s<=rows-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){ 
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern11 pattern11 = new Pattern11();
        pattern11.process(5);
    }
}
