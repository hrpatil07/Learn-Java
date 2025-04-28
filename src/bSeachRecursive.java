package src;

class SearchRecursive
{
    public int binarySearchFuncRecursive(int arr[],int target,int low, int high)
    {
        if(low > high)
        {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if(arr[mid] == target)
        {
            return mid;
        }
        else if(arr[mid] > target)
        {
            return binarySearchFuncRecursive(arr,target,low,mid-1);
        }
        else{
            return binarySearchFuncRecursive(arr,target,mid+1,high);
        }
    }
}

public class bSeachRecursive
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,5,6};
        int target = 2;
        SearchRecursive s = new SearchRecursive();
        int value = s.binarySearchFuncRecursive(arr,target,0,arr.length-1);
        System.out.println(value);
    }
}
