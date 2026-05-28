package DSA_Practise.Day10;

import java.util.HashSet;
import java.util.Scanner;

public class Solution{
    public static int passwordStrength(String password){
         int count =0;
        HashSet<Character> set = new HashSet<>();
        for(char ch : password.toCharArray()){
            if(set.contains(ch)){
                continue;
            }
            set.add(ch);
            if(ch>='a' && ch<='z'){
                count +=1;
            }
            else if(ch>='A' && ch<='Z'){
                count +=2;
            }
            else if(ch>='0' && ch<='9'){
                count +=3;
            }
            else{
                count +=5;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password for which you want to check the strength");
        String password = sc.nextLine();
        int result = passwordStrength(password);
        System.out.println(result);
        sc.close();
        
    }
}