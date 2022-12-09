//Q. Print all three digits armstrong numbers
public class ArmstrongNumbers {
    public static void main(String[] args) {
        ArmstrongNumbers am= new ArmstrongNumbers();
        am.findarmstrong();
    }

    public void findarmstrong() {
        for(int i=100;i<1000;i++){
            if(process(i)==true)
            {
                System.out.println(i);
            }
        }
    }

    public boolean process(int x) {
        int ans=0;
        int rem;
        int original=x;
        while(x>0){
            rem=x%10;
            x=x/10;
            ans=ans+(rem*rem*rem);
            }
        return original == ans;
    }
    
}
