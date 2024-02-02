//Water the plants
//A gallery with plants is divided into n parts, numbered 0, 1, 2, 3, ..., n-1. There are provisions for attaching water sprinklers in every division. A sprinkler with range x at division i can water all divisions from i-x to i+x.
//Given an array gallery[] consisting of n integers, where gallery[i] is the range of the sprinkler at partition i (a power of -1 indicates no sprinkler attached), return the minimum number of sprinklers that need to be turned on to water the entire gallery. If there is no possible way to water the full length using the given sprinklers, print -1.

class Solution {
    int min_sprinklers(int arr[], int n) {
        // code here
        int[]arr2=new int[n];

        for(int j=0;j<n;j++) {
            if(arr[j]==-1) continue;
            int st=Math.max(0,j-arr[j]),end=Math.min(n-1,j+arr[j]);
            arr2[st]=Math.max(arr2[st],end);
        }

        for(int j=1;j<n;j++) {
            arr2[j]=Math.max(arr2[j],arr2[j-1]);
        }
        
        int cnt=0,in=0;

        while(in<n) {

            cnt++;

            if(in>arr2[in]) return -1;

            in=arr2[in]+1;

        }

        return cnt;
    }
}
