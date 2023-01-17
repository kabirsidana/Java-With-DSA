import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("-- This is Rock Paper Scissor Game --");
        System.out.println("Rock(s)  ||   Paper(p)   ||   Scissor(s)" );
        Random random = new Random();
        char [] arr={'r','p','s'};
        int count=1;
        int userpoints=0;
        int comppoints=0;
        do{
            int a=random.nextInt(0,3);
            System.out.println("Enter Rock Paper Scissor");
            char input = sc.next().charAt(0);
            if(input=='r' && arr[a]=='p'){
                System.out.println("Round Number -:"+count);
                System.out.println(" User Point ++");
                    userpoints++;
                    count++;
            }
            if(input=='p' && arr[a]=='r'){
                System.out.println("Round Number -:"+count);
                System.out.println(" Computer Point ++");
                comppoints++;
                count++;
            }
            if(input=='r' && arr[a]=='s'){
                System.out.println("Round Number -:"+count);
                System.out.println(" User Point ++");
                userpoints++;
                count++;
            }
            if(input=='s' && arr[a]=='r'){
                System.out.println("Round Number -:"+count);
                System.out.println(" Computer Point ++");
                comppoints++;
                count++;
            }
            if(input=='p' && arr[a]=='s'){
                System.out.println("Round Number -:"+count);
                System.out.println(" Computer Point ++");
                comppoints++;
            }
            if(input=='s' && arr[a]=='p'){
                System.out.println("Round Number -:"+count);
                System.out.println(" User Point ++");
                userpoints++;
                count++;
            }
            if(input==arr[a]){
                System.out.println("Round Number -:"+count);
                System.out.println("Both Gets One Point");
                comppoints++;
                userpoints++;
                count++;
            }
        }while(count!=10);
        System.out.println("User Points -:"+userpoints);
        System.out.println("Computer Points -:"+comppoints);
        if(userpoints>comppoints){
            System.out.println("User Wins");
        }
        else{
            System.out.println("Computer Wins");
        }
        
    }
}
