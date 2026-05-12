package DSA_Practise.Day06;

public class Solution2 {
    // this will be the brute force approach to find the majority element in the array
    // it will take O(n^2) time complexity

    public static int majority(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
             if(count>nums.length/2){
            return nums[i];
        }
    }
    return -1;    
    }

    public static void main(String args[]){
        int nums[] = {1,2,2,1,1};
        int result = majority(nums);
        System.out.println(result);
    }
}
