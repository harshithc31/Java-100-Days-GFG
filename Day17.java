//Winner of an election
//Given an array of n names arr of candidates in an election, where each name is a string of lowercase characters. A candidate name in the array represents a vote casted to the candidate. Print the name of the candidate that received the maximum count of votes. If there is a draw between two candidates, then print lexicographically smaller name.

class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        TreeMap<String,Integer> map=new TreeMap<>();
        for(String s:arr) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String ans="";
        int max=Integer.MIN_VALUE;
        for(String s:map.keySet())
        {
            int t=map.get(s);
            if(t>max)
            {
                max=t;
                ans=s;
            }
        }
        String res[]={ans,String.valueOf(max)};
        return res;
    }
}
