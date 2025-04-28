package src;
class Search {
    public  int binarySearchFunc(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(arr[mid] == target)
            {
                return mid;
            } else if (arr[mid] > target)
            {
                right = mid - 1;
            }else
            {
                left = mid + 1;
            }
        }
        return -1;
    }

}
public class BinarySeach
{

    public static void main(String[] args)
    {
        int[] arr = {2,3,4,5,6,7};
        int target = 7;
        Search s = new Search();
        int value = s.binarySearchFunc(arr,target);
        System.out.println(value);

    }
}
