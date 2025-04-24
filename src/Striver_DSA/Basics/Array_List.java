package src.Striver_DSA.Basics;

import java.util.ArrayList;
import java.util.List;

public class Array_List
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.add(1,23);
        System.out.println(arrayList.contains(122));
        arrayList.remove(1);
        arrayList.clear();

        List<String> arrList = new ArrayList<>();
        arrList.add("Apple");
        arrList.add("Banana");
        System.out.println(arrList); // Output: [Apple, Banana]

    }
}
