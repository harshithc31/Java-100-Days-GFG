//Count digit groupings of a number
//Given a string str consisting of digits, you can divide it into sub-groups by separating the string into substrings. For example, "112" can be divided as {"1", "1", "2"}, {"11", "2"}, {"1", "12"}, and {"112"}.
//A valid grouping can be done if you are able to divide sub-groups where the sum of digits in a sub-group is less than or equal to the sum of the digits of the sub-group immediately right to it. Your task is to determine the total number of valid groupings that could be done for a given string.

class Solution {
    public int TotalCount(String str) {
        // Code here
        int n = str.length();
        int dp[][] = new int[n][901];
        for(int temp[]:dp) Arrays.fill(temp,-1);
        return help(str,0,0,dp);
    }
    
    static int help(String str, int index, int preSum, int dp[][]){
        if(index == str.length())return 1;
        if(dp[index][preSum]!=-1) return dp[index][preSum];
        int curSum=0, ans = 0;
        for(int i=index; i<str.length(); i++){
            curSum += str.charAt(i) -'0';
            if(curSum>=preSum){
                ans+=help(str,i+1,curSum,dp);
            }
        }
      
        return  dp[index][preSum]=ans;
    }
}
