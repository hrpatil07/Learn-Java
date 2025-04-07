package src;

public class ForLoop
{
    public  static void main(String[] args){
        for(int i = 0; i <= 5; i++){
            System.out.println("Value "+i);
            int j = 1;
            for(;j <= 5;) {
                System.out.println("           Value "+j);
                j++;
            }
        }
    }

}
