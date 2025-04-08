package src;
//Method Overloading
class Cal
{
    public int add(int a, int b)
    {
        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }
}

public class MethodOverloading
{
    public  static  void main(String[] args)
    {
        Cal calc = new Cal ();
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1,2));

    }

}
