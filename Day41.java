//Longest Palindrome in a String
//Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string that reads the same backward. More formally, S is a palindrome if reverse(S) = S. In case of conflict, return the substring which occurs first ( with the least starting index).

class Solution{
    static String longestPalin(String S){
        // code here
        int len = S.length();
        if(len==0 || len==1) return S;
        String ans = Character.toString(S.charAt(0));
        for(int i=0; i<len; i++){
            for(int j=len-1; j>i; j--){
                if((j-i)+1 <= ans.length()) break;
                if(S.charAt(i) == S.charAt(j)){
                    if(isPalindrome(S, i, j)){
                        if((j-i)+1 > ans.length()){
                            ans = S.substring(i, j+1);
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static boolean isPalindrome(String str, int s, int e){
        while(s < e){
            if(str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}
