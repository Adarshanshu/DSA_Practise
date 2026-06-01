package DSA_Practise.Day12;

import java.util.Arrays;

public class Solution{
    public static int minimumCost(int cost[]){
        // in this question we have to find the minimum cost to buy candies
        // so that we buy two candies with highest price and we wil gwt the next highest price candy for free
        // we have to calculate the total expenditure which we have to make to buy the candies

        int sum =0;
        int count =0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            count++;
            if(count%3==0){
                continue;
            }
            else{
                sum += cost[i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int cost[] = {6,5,7,9,2,2};
        int result = minimumCost(cost);
        System.out.println(result);
    }
}