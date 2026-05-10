package DSA_Practise.Day04;

import java.util.*;
public class Solution{
    public static int find(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for(int num : nums){
            if(set.contains(num)){
             max = Math.max(num,max);
            }
            else{
                set.add(num);
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int nums[] =  new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result = find(nums);
        System.out.println(result);
        sc.close();
    }
}
