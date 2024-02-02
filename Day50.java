//Search Pattern (KMP-Algorithm)
//Given two strings, one is a text string, txt and other is a pattern string, pat. The task is to print the indexes of all the occurences of pattern string in the text string. Use one-based indexing while returning the indices. 
//Note: Return an empty list incase of no occurences of pattern. Driver will print -1 in this case.

class Solution {  
    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            int k = 0;
            while (k < pat.length() && pat.charAt(k) == txt.charAt(i + k)) {
                k++;  
            }
            if (k == pat.length()) {
                list.add(i+1);
            }
        }
        
        return list;
    }
}
