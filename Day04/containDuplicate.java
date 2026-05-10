package DSA_Practise.Day04;

import java.util.*;
public class containDuplicate {
    public static boolean haveDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            else{
                set.add(num);
            }
        }
        return false;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("enter the elements of the array ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();

        }
        System.out.println("contains dupicate -> "+haveDuplicate(nums));
        sc.close();
    }
}
