//Butterfly Pattern
//    *      *
//    **    **
//    ***  ***
//    ********
//    ********
//    ***  ***
//    **    **
//    *      *
public class Pattern10 {
    public void process(int a) {
        int rows;

        rows = a;
        for (int i = 1; i <= rows; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            // another method to do this 2*(rows-i)
            for (int s = 1; s <= 2 * rows - (i * 2); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int y = rows; y >= 1; y--) {
            for (int x = 1; x <= y; x++) {
                System.out.print("*");
            }
            for (int s = 1; s <= 2 * rows - (y * 2); s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern10 pattern10 = new Pattern10();
        pattern10.process(6);
    }
}