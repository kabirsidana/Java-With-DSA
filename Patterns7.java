//Inverted Half Pyramid with Numbers
// 12345
// 1234
// 123
// 12
// 1
/*import java.util.Scanner;
public class Patterns7 {
    public void process(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Patterns7 patterns7 = new Patterns7();
        patterns7.process();
    }
    
}
 */

 //Method 2
 // j<=rows-i+1
import java.util.Scanner;
public class Patterns7 {
    public void process(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Patterns7 patterns7 = new Patterns7();
        patterns7.process();
    }
    
}
