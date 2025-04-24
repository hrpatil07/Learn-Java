package src.Striver_DSA.Basics;

public class SelectionSort
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,2,4,5,3};
        for(int i = 0 ; i < arr.length -1 ;i++)
        {
            int min = i;
            for(int j = i; j < arr.length ;j++)
            {
                if(arr[j] < arr[min])
                {
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        for(int i=0; i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
