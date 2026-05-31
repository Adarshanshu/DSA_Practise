package DSA_Practise.Day11;

public class Solution {
    public static int minimumSwap(int nums[]){
        // in this question we have to find the minimum swap to move all the zeroes to the last
        // so if see in the array -> [0,1,0,3,12] we have to move zeroes to last 
        // so if the array is nonzero then we have to do nothing
        // [x,x,x,0,0] this is how the array should look
        int k =0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                k++;
            }
        }
        for(int i=0;i<k;i++){
            if(nums[i]==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int nums[] = {0,1,0,3,12};
        int result = minimumSwap(nums);
        System.out.println(result);
    }
}
