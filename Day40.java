//Array Pair Sum Divisibility Problem
//Given an array of integers nums and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n;i++) {
            map.put(nums[i]%k, map.getOrDefault(nums[i]%k,0)+1);
        }
        int rem = 0;
        for(int i = 0;i <n; i++) {
            rem =nums[i]%k;
            if(rem == 0) {
                if(map.get(rem)%2!= 0) return false;
            }
            else if(map.get(rem)!= map.get(k - rem)) return false;
        }
        return true;
    }
}
