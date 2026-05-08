package DSA_Practise.Day03;

import java.util.*;
public class Solution {
    public static void binarySearch(int nums[],int target){
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                System.out.println("the index of trget is "+mid);
                break;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
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
        binarySearch(nums,target);
        sc.close();
    }
}
