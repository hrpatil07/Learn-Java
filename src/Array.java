package src;

public class Array
{
    public static  void main(String args[]){
        int nums[] = {1,2,3,4};
        System.out.println("Static Array");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        int numsArray[] = new int[4];
        System.out.println("Dynamic Array");
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = i;
        }
        for (int i = 0; i < numsArray.length; i++) {
            System.out.println(numsArray[i]);
        }
    }
}
