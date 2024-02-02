//Remove K Digits
//Given a non-negative integer S represented as a string, remove K digits from the number so that the new number is the smallest possible.
//Note : The given num does not contain any leading zero.

class Solution {
    public String removeKdigits(String S, int K) {
        // code here
        int index = 0;
        int nonZero = 0, cut = 0;
        Stack<Integer> stack = new Stack<>();
        
        while(index < S.length() && nonZero <= K) {
            if(S.charAt(index) != '0') {
                nonZero++;
            } else cut = index+1;
            index++;
        }
        for(int i=0; i<cut; i++) {
            if(S.charAt(i) != '0') K--;
        }
        while(cut < S.length()) {
            Integer num = Character.digit(S.charAt(cut), 10);
            while(!stack.isEmpty() && stack.peek() > num && K > 0) {
                stack.pop();
                K--;
            }
            
            stack.push(num);
            cut++;
        }
        while(!stack.isEmpty() && K > 0) {
            stack.pop();
            K--;
        }
        
        StringBuilder ans = new StringBuilder();
        
        while(!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        
        return ans.length() == 0 ? "0" : ans.reverse().toString();
    }
}
