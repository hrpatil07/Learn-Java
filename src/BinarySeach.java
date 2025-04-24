package src;
class Search {
    public  int binarySearchFunc(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length;
        for(int i = 0 ; i < arr.length; i++)
        {
            int mid = (left+right)/2;
            if(arr[mid] == target) return mid;

            if(arr[mid] < target)
            {
                left = mid+1;
            }else{
                right = mid-1;
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
        int target = 2;
        Search s = new Search();
        int value = s.binarySearchFunc(arr,target);
        System.out.println(value);

    }
}
