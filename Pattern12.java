//Hollow Rhombus
//       *****
//      *   *
//     *   *
//    *   *
//   *****
public class Pattern12 {
    public void process(int a){
        int rows;
        rows=a;
        for (int i=1;i<=rows;i++){
            for(int s=1;s<=rows-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){
                if(i==1||i==5||j==1||j==5){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");}
            }
            System.out.println();
        }
    }    
    public static void main(String[] args) {
        Pattern12 pattern12 = new Pattern12();
        pattern12.process(5);
    }
}
