package DSA_Practise.Day13;

public class Solution {
   public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration){
    int ans = Integer.MAX_VALUE;
    //in this question we have to find the earliest Finish Time 
    // to do this we have two option either we will start from land and then we will go to the water 
    // another option is to start with the water and then go to land 
    // we will apply brute force aproach to find the best answer 
    for(int i=0;i<landStartTime.length;i++){
        for(int j=0;j<waterStartTime.length;j++){
            int finish1 = landStartTime[i] + landDuration[i];
            int total1 = Math.max(finish1,waterStartTime[j])+ waterDuration[j];
            int finish2 = waterStartTime[j] + waterDuration[j];
            int total2 = Math.max(finish2,landStartTime[i])+landDuration[i];
            ans = Math.min(ans,Math.min(total1, total2));
        }
    }
    return ans;
   }
   // it will take the time complexity of O(nXm)
   // whare n = landSartTime.length;
   // and m = waterSartTime.length;
   // it can be optimized by using another aproach 
    public static void main(String args[]){
        int landStartTime[] = {2,8};
        int landDuration[] = {4,1};
        int waterStartTime[] = {6};
        int waterDuration[] = {3};
        int result = earliestFinishTime(landStartTime,landDuration,waterStartTime,waterDuration);

        System.out.println(result);
    }
}
