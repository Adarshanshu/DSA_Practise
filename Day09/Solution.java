package DSA_Practise.Day09;

import java.util.ArrayList;

public class Solution{
    public static int[] occurence(int nums[],int k){
        //first we will create a arrraylist to store the answer
        ArrayList<Integer> list = new ArrayList<>();
        int count =1;
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count =1;
            }
            if(count<=k){
                list.add(nums[i]);
            }
        }
        int ans[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;

    }
    public static void main(String args[]){
        int nums[] = {1,1,1,2,2,3};
        int k=2;
        int result[] = occurence(nums,k);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}