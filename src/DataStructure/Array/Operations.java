package src.DataStructure.Array;
import java.util.*;

public class Operations
{
    public static void main(String args[]){
        int marks[] = new int[50];
        int numbers[] = {1,2,3};
        int moreNumbers[] = {4,5,6};
        String fruits[] = {"Apple"};

        //Input - Output in Array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Marks of Subject 1 "+marks[0]);
        System.out.println("Marks of Subject 2 "+marks[1]);
        System.out.println("Marks of Subject 3 "+marks[2]);

        sc.close();
    }
}
