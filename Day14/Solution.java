package DSA_Practise.Day14;
public class Solution{
    public static int singleNumber(int nums[]){
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor ^= nums[i];
        }
        return xor;
    }
    public static void main(String args[]){
        int nums[] ={1,2,2,4,4,1,5};
        int result = singleNumber(nums);
        System.out.println(result);
    }
}