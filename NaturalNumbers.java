import java.util.Scanner;
public class NaturalNumbers {
    void process(){
        Scanner sc = new Scanner(System.in);
        int total =0;
        System.out.println("---This Program will print Sum of First n Natural Number --- ");
        System.out.println("Enter Number -: ");
        int n = sc.nextInt();
         for(int i=1;i<=n;i++){
            total=total+i;
            
         }
         System.out.println(total);


    }
    
        public static void main(String[] args) {
            NaturalNumbers naturalnumbers=new NaturalNumbers();
            naturalnumbers.process();
     
    }
    
    
}

