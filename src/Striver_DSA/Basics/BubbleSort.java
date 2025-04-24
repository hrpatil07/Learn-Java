package src.Striver_DSA.Basics;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[] = {100,1,3,2,70,5,60,3};
        int n = arr.length;
        for(int i = n-1 ; i > 0; i--)
        {
            int swapped = 0;
            for(int j = 0; j < i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = 1;
                }
            }
            if(swapped == 0)
            {
                break;
            }
        }
        for(int i = 0 ; i < n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
