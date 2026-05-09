package DSA_Practise.Day03;

import java.util.*;
public class Solution {
    public static int binarySearch(int nums[],int target){
        int start =0;
        int end = nums.length-1;
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }else{
                return -1;
            }
        }
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array ");
        int n =sc.nextInt();
        System.out.println("keep in mind that the array should be sorted  ");
        System.out.println("enter the elments of the array ");
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
         System.out.println("enter the target you want to find ");
        int target = sc.nextInt();
        int result = binarySearch(nums,target);
        if(result!=-1){
            System.out.println("target index is at -> "+result);
        }
        else{
            System.out.println("your target is not in thhe array ");
        }
        sc.close();
    }
}
