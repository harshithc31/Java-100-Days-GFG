//Implement Atoi
//Given a string, s, the objective is to convert it into integer format without utilizing any built-in functions. If the conversion is not feasible, the function should return -1.
//Note: Conversion is feasible only if all characters in the string are numeric or if its first character is '-' and rest are numeric.

class Solution {
    int atoi(String s) {
	  // Your code here
	
	    boolean neg = false;
	
        if(s.charAt(0) == '-') {
            neg = true;
        }
    
        int num = 0;
    
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '-' && i == 0) {
                continue;
            }
       
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num *= 10;
                num += (s.charAt(i) - '0');
            }
            else {
                return -1;
            }
        }
     
        if(neg) {
            return (-1) * num;
        }

        return num;
    }
}
