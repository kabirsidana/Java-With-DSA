import java.util.Arrays;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        int again;
        do{
            game();
            System.out.println("Press 1 to play again else press 0");
            Scanner sc= new Scanner(System.in);
            again=sc.nextInt();
        }while(again==1);
    }

    private static void game() {

        Scanner sc= new Scanner(System.in);
        System.out.println("  ----WELCOME TO TICK TACK TOE ----  ");
        System.out.println("NOTE:- "+"ENTER THE NUMBER ACCORDINGLY WHERE YOU WANT TO ADD YOUR CROSS");
        String [] [] matrix= {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
        };
        String ans;
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        for (int i = 1; i < 10; i++) {


            //left column
            if(matrix[0][0]==matrix[1][0] && matrix[1][0]==matrix[2][0]  ){
                if(matrix[0][0]=="X"){
                    System.out.println("-----X WINS-----");
                    break;
                }
                else{
                    System.out.println("----- O WINS -----");
                    break;
                }
            }
            //middle column
            if(matrix[0][1]==matrix[1][1] && matrix[1][1]==matrix[2][1] ){
                if(matrix[0][1]=="X"){
                    System.out.println("-----X WINS-----");
                    break;
                }
                else{
                    System.out.println("----- O WINS -----");
                    break;
                }
            }
            //last column
            if(matrix[0][2]==matrix[1][2] && matrix[1][2]==matrix[2][2] ){
                if(matrix[0][2]=="X"){
                    System.out.println("-----X WINS-----");
                    break;
                }
                else{
                    System.out.println("----- O WINS -----");
                    break;
                }
            }
            //first row
            if(matrix[0][0]==matrix[0][1] && matrix[0][1]==matrix[0][2] ){
                if(matrix[0][2]=="X"){
                    System.out.println("-----X WINS-----");
                    break;
                }
                else{
                    System.out.println("----- O WINS -----");
                    break;
                }
            }
            //second row
            if(matrix[1][0]==matrix[1][1] && matrix[1][1]==matrix[1][2] ){
                if(matrix[1][1]=="X"){
                    System.out.println("-----X WINS-----");
                    break;
                }
                else{
                    System.out.println("----- O WINS -----");
                    break;
                }
            }
            //third row
            if(matrix[2][0]==matrix[2][1] && matrix[2][1]==matrix[2][2] ){
                if(matrix[2][1]=="X"){
                    System.out.println("-----X WINS-----");
                    break;
                }
                else{
                    System.out.println("----- O WINS -----");
                    break;
                }
            }
            //first diagonal
            if(matrix[0][0]==matrix[1][1] && matrix[1][1]==matrix[2][2] ){
                if(matrix[0][0]=="X"){
                    System.out.println("-----X WINS-----");
                    break;
                }
                else{
                    System.out.println("----- O WINS -----");
                    break;
                }
            }
            //second diagonal
            if(matrix[0][2]==matrix[1][1] && matrix[1][1]==matrix[2][0] ){
                if(matrix[0][2]=="X"){
                    System.out.println("-----X WINS-----");
                    break;
                }
                else{
                    System.out.println("----- O WINS -----");
                    break;
                }
            }
            if(i % 2!=0){
              System.out.println("Turn "+i);  
              System.out.println("Player X");  
              ans =sc.nextLine();
              if(ans.equals("1")||ans.equals("2")||ans.equals("3") ){
                int x=Integer.parseInt(ans);
                matrix[0][x-1]="X";
            }
            if(ans.equals("4")||ans.equals("5")||ans.equals("6")){
                int x=Integer.parseInt(ans);
                matrix[1][x-4]="X";
            }
            if(ans.equals("7")||ans.equals("8")||ans.equals("9")){
                int x=Integer.parseInt(ans);
                matrix[2][x-7]="X";
            }
            System.out.println(Arrays.toString(matrix[0]));
            System.out.println(Arrays.toString(matrix[1]));
            System.out.println(Arrays.toString(matrix[2]));
            }
            else{
                System.out.println("Turn "+i);  
              System.out.println("Player O");
              ans =sc.nextLine(); 
              if(ans.equals("1")||ans.equals("2")||ans.equals("3")){
                int x=Integer.parseInt(ans);
                matrix[0][x-1]="O";
            }
            if(ans.equals("4")||ans.equals("5")||ans.equals("6")){
                int x=Integer.parseInt(ans);
                matrix[1][x-4]="O";
            }
            if(ans.equals("7")||ans.equals("8")||ans.equals("9")){
                int x=Integer.parseInt(ans);
                matrix[2][x-7]="O";
            }
            System.out.println(Arrays.toString(matrix[0]));
            System.out.println(Arrays.toString(matrix[1]));
            System.out.println(Arrays.toString(matrix[2]));
            }
        }
        System.out.println("-- GAME TIED --");
    
    }
    }

