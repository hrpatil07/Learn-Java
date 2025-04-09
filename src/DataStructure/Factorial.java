package src.DataStructure;

class RecursionFactorial
{
    public int Factorial(int n)
    {
        if(n<=1){
            return 1;
        }else{
            return n * Factorial(n-1);
        }
    }
}

public class Factorial
{
    public static void main(String args[])
    {
        System.out.println("Factorial of 3");
        RecursionFactorial rf = new RecursionFactorial();
        System.out.println(rf.Factorial(5));
    }
}
