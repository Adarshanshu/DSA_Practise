package DSA_Practise.Day05;

import java.util.ArrayList;

public class Solution1 {
    public static void separateDigits(int nums[]){
        // first we will crreate a arrayList because we dont know the exacy size of the answer array
        ArrayList<Integer> list = new ArrayList<>();
        //now we will convert array into String 
        for(int num : nums){
            String str = String.valueOf(num);

        // now we will iterate on Str and add every char of String in it 
        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i)-'0'); // subtracted 0 to convert that String into the Integer
        }
    }
        // now create a answer Array to store the list value
        int answer[] = new int[list.size()];
        // now iterate over the list and add the elements in the answer array
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
       for(int i=0;i<answer.length;i++){
        System.out.print(answer[i]+" ");
       }
    
    }
    public static void main(String args[]){
        int nums[] = {12,34,56,787,90};
       separateDigits(nums);
    }
}
