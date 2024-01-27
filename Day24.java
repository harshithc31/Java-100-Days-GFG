//Anagram
//Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        int i = str1.length - 1;
        int j = str2.length - 1;
        
        if(i != j) {
            return false;
        }
        
        while(i >= 0 && j >=  0) {
            if(str1[i] == str2[j]) {
                i--;
                j--;
            } else {
                return false;
            }
        }
        
        return true;
    }
}
