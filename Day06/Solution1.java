package DSA_Practise.Day06;
public class Solution1{

    // it is the most optimized apraoch to find the majority element in the array
    // it takes time complexity of order of n - O(n)

    // this approach is also known as the moore's voting algorithm
    public static int majority(int nums[]){
        int freq =0;
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                ans = nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {1,2,2,1,1};
        int result = majority(nums);
        System.out.println(result);
    }
}