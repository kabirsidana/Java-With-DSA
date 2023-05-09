import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        int r=0;
        do{
            Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Currency in Indian Rupess ₹ -: ");
        int rupee=sc.nextInt();
        System.out.println("Choose one of the following currency -: ");
        System.out.println("1.USD $ ");
        System.out.println("2.Euro € ");
        System.out.println("3.Yen Ұ ");
        System.out.println("4.GBP £ ");
        System.out.println("5.AUD $ ");
        System.out.println("6.CAD $ ");
        System.out.println("7.Renmibi ¥ ");
        System.out.println("8.Swiss Franc ₣ ");

        int input = sc.nextInt();
        switch (input){
            case 1:System.out.println("USD $-: "+(rupee*80));
                break;
            case 2:System.out.println("Euro €-: "+(rupee*0.011));
                break;
            case 3:System.out.println("Yen Ұ  "+(rupee*1.65));
                break;
            case 4:System.out.println("GBP £  "+(rupee*0.0097));
                break;
            case 5:System.out.println("AUD $  -: "+(rupee*0.018));
                break;
            case 6:System.out.println("CAD $-: "+(rupee*0.016));
                break;
            case 7:System.out.println("Renmibi ¥ -: "+(rupee*0.085));
                break;
            case 8:System.out.println("Swiss Franc ₣ "+(rupee*0.011));
                break;
            default:
            System.out.println("Wrong Input");
        }
         System.out.println("1.Convert Again 2.End");   
         r = sc.nextInt();
        }while(r==1);
        
    }
}
