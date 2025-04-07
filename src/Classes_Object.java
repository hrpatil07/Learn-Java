package src;

class Calculator
{
    public int add(int num1,int num2)
    {
        return  num1+num2;
    }
}

public class Classes_Object
{

    public static void main(String[] args){
        Calculator calc = new Calculator();
        int value = calc.add(1,2);
        System.out.println(value);
    }


}
