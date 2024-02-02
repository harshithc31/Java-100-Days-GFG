//Count possible ways to construct buildings
//There is a road passing through a city with N plots on both sides of the road. Plots are arranged in a straight line on either side of the road. Determine the total number of ways to construct buildings in these plots, ensuring that no two buildings are adjacent to each other. Specifically, buildings on opposite sides of the road cannot be adjacent.
//Using * to represent a plot and || for the road, the arrangement for N = 3 can be visualized as follows: * * * || * * *.
//Note: As the answer can be very large, print it mod (10^9)+7.

class Solution {
    public int TotalWays(int N) {
        // Code here
        int mod = 1000000007;
        long a=1;
        long b=2;
        long c=2;
        for(int i=2; i<=N;i++){
            c=(a+b)%mod;
            a=b;
            b=c;
        }
        c = (c*c)%mod;
        return (int)c;
    }
}
