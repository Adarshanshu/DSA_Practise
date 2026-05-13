package DSA_Practise.Day07;

import java.util.HashSet;

public class Solution {
    public static int[] find(int nums[][]){
        int n = nums.length;
        int currSum =0;
        int sq = n*n;
        HashSet<Integer> set = new HashSet<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(set.contains(nums[i][j])){
                    ans[0] = nums[i][j];
                }
                else{
                    set.add(nums[i][j]);
                    currSum += nums[i][j];
                }
            }
        }
        int totalSum = sq*(sq+1)/2;
        ans[1] = totalSum - currSum;
        return ans;
    }
    public static void main(String args[]){
        int nums[][] = {{1,3},{2,2}};
        int result[] = find(nums);
       for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
       }
       System.out.println();
    }
}
