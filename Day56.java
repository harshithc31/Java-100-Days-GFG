//Longest subarray with sum divisible by K
//Given an array arr containing N integers and a positive integer K, find the length of the longest sub array with sum of the elements divisible by the given value K.

class Solution {
    int longSubarrWthSumDivByK(int a[], int n, int k) {
        // Complete the function
       
        HashMap<Integer,Integer> map = new HashMap<>();
        int c = 0;
        int max1 = 0;
        map.put(0,-1);
        for(int i = 0; i<n;i++)
        {
            c += a[i];
            int rem = c %k;
            if(rem <0)
            {
                rem += k;
            }
            if(map.containsKey(rem))
            {
                max1 = Math.max(max1,i - map.get(rem));
            }
            if(!map.containsKey(rem))
            {
                map.put(rem,i);
            }
        }
     
        return max1;
    }
}
