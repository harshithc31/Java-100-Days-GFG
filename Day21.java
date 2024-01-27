//Rightmost different bit
//Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers. If both M and N are the same then return -1 in this case.

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here        
        int xorResult = m ^ n;

        // If both M and N are the same, return -1.
        if (xorResult == 0) {
            return -1;
        }

        // Find the position of the rightmost set bit in XOR result.
        int position = 1;
        while ((xorResult & 1) == 0) {
            xorResult >>= 1;
            position++;
        }

        return position;
    }
}
