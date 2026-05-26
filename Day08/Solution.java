package DSA_Practise.Day08;

public class Solution{
    public static int special(String words){
        boolean upper[] = new boolean[26];
        boolean lower[] = new boolean[26];
        for(char ch : words.toCharArray()){
            if(ch>='a'&&ch<='z'){
                lower[ch-'a'] = true;
            }
            else if(ch>='A'&& ch<='Z'){
                upper[ch-'A'] = true;
            }
           
        }
         int count =0;
            for(int i=0;i<26;i++){
                if(lower[i] && upper[i]){
                    count++;
                }
            }
        return count;
    }
    public static void main(String args[]){
        String words ="AaBBcCCDd";
        int result = special(words);
        System.out.println(result);
    }
}