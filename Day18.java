//Smallest window containing 0, 1 and 2
//Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.

class Solution {
    public int smallestSubstring(String s) {
        // Code here
        if(s.length()<3){
            return -1;
        }
        
        boolean present[] = new boolean[3];
        int i=0;
        int j=1;
        for(int k=1;k<s.length();k++){
            if(s.charAt(k)!=s.charAt(k-1)){
                j = k;
                i = k-1;
                break;
            }
        }
        
        int count = Integer.MAX_VALUE;
        while(i<j && j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                int val1 = s.charAt(i) - '0';
                int val2 = s.charAt(j) - '0';
                present[val1] = true;
                present[val2] = true;
                if(present[0]==true && present[1]==true && present[2]==true){
                    count = Math.min(count,j-i+1);
                }
                j++;
            } else{
                i = j-1;
                j++;
            }

        }
        return (count!=Integer.MAX_VALUE)?count:-1;
    }
}
