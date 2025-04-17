package src.Striver_DSA.Basics;

class Data
{
    private Integer num;
    private String name;
    private InternalData internalData;
    Data(int _num,String _name , int _revenue){
        this.num = _num;
        this.name = _name;
        this.internalData = new InternalData(_revenue);
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setNum(int num)
    {
        this.num = num;
    }
    public Integer getNum()
    {
        return num;
    }
    public String getName()
    {
        return name;

    }
}

class InternalData
{
    public Integer revenue ;
    InternalData(Integer _revenue)
    {
        this.revenue = _revenue;
    }
}

public class CustomClass
{
    public static void main(String args[])
    {
        Data dataObj1 = new Data(1,"Hrushi",1000);
        Data dataObj2 = new Data(2,"Bhushan",10000);
        System.out.println(dataObj2.getName());
        dataObj1.setName("Hrushikesh");
        System.out.println(dataObj1.getName());

    }
}
