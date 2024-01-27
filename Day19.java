//Check if strings are rotations of each other or not
//You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.

class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        StringBuilder temp = new StringBuilder();
        temp.append(s1);
        temp.append(s1);
       
        return temp.lastIndexOf(s2) >=0 ? true :false;
    }
    
}
