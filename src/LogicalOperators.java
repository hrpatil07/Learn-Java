package src;

public class LogicalOperators
{
    public static void main(String args[])
    {
        int x = 127;
        int y = 127;
        int a = 127;
        int b = 127;

        boolean resultAndOperator = x <= y && y <= a;
        System.out.println(resultAndOperator);

        boolean resultOrOperator = x <= y && a < b;
        System.out.println(resultOrOperator);

        System.out.println(!resultOrOperator);

    }
}
