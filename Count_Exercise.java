// Take Input From User till the user want and at the end 
//display Number of Positive , negative and zero are inputted 
import java.util.Scanner;
public class Count_Exercise {
    public void process(){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Numbers till you want ");
        int positive_count=0;
        int zero_count=0;
        String exit;
        int negative_count=0;
        do{
            System.out.println("Enter Number");
            int num = sc.nextInt();
            if(num==0){
                zero_count++;
            }
            else if(num>0){
                positive_count++;
            }
            else if (num<0){
                negative_count++;
            }
            System.out.println("Enter 'e' to Exit , n for no");
            exit = sc.next();
        } while(exit.equals("n"));
        System.out.println("The Number of Zero's are"+zero_count);
        System.out.println("The Number of Positive Number are"+positive_count);
        System.out.println("The Number of Negative are"+negative_count);
        
    }
    public static void main(String[] args) {
        Count_Exercise ce= new Count_Exercise();
        ce.process();
    }
    
}
