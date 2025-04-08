package src;

class Computer
{
    public void musicPlayer(){
        System.out.println("Music Player");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=100)
            return "Pen";
        else
            return "Nothing";

    }
}

public class Method {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.musicPlayer();
        String pen = comp.getMeAPen(10);
        System.out.println(pen);
    }
}
