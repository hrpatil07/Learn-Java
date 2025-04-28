package src;
class FirstOccurenceClass {
    public  int[] binarySearchFunc(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;
        int firstOccurence = -1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(arr[mid] == target)
            {
                firstOccurence = mid;
                right = mid - 1;
            } else if (arr[mid] > target)
            {
                right = mid - 1;
            }else
            {
                left = mid + 1;
            }
        }
        left = 0;
        right = arr.length - 1;
        int lastOccurence = -1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(arr[mid] == target)
            {
                lastOccurence = mid;
                left = mid + 1;
            } else if (arr[mid] > target)
            {
                right = mid - 1;
            }else
            {
                left = mid + 1;
            }
        }
        System.out.println("Count the occurence " + (int)((lastOccurence-firstOccurence)+1));
        return new int[] {firstOccurence, lastOccurence};
    }

}
public class FirstOccurence
{

    public static void main(String[] args)
    {
        int[] arr = {0,2,2,2,2,3,3,3,4,4,4,5,6,7};
        int target = 3;
        FirstOccurenceClass s = new FirstOccurenceClass();
        int[] value = s.binarySearchFunc(arr,target);
        System.out.println(value[0]+" "+value[1]);

    }
}
