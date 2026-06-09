package DSA_Practise.Day15;

public class Solution {
    public static long maxTotalValue(int[] nums, int k){
        // so in this question we will find minimum value and maximum value
        // since we can take the same subarray multiple times so 

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return (long)(max-min)*k;
    }
    public static void main(String args[]){
        int nums[] ={4,2,5,1};
        int k= 3;
        long result = maxTotalValue(nums,k);
        System.out.println(result);
    }
}
