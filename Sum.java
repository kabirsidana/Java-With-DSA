import java.util.Scanner;
class Sum{
public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter First Number");
  int a=sc.nextInt();
  System.out.println("Enter The Second Number");
  int b=sc.nextInt();
  int c =a+b;
  System.out.println("The Sum is "+c);
}
}