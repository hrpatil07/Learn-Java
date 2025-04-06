package src;

public class WhileLoop
{
    public  static  void main(String[] args)
    {
        int i = 1;
        while(i<=2)
        {
            System.out.println("Inside I Loop"+i);
            int j = 1;
            while(j<=2)
            {
                System.out.println("Inside J Loop"+j);
                j++;
            }
            i++;
        }
    }
}
