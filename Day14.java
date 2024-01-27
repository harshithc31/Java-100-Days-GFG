// Count More than n/k Occurences
// Given an array arr of size N and an element k. The task is to find the count of elements in the array that appear more than n/k times.
class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer,Integer> h=new HashMap<>();
      
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(int i:arr){
            if(h.containsKey(i)&&h.get(i)>n/k){
                h.remove(i);
                ans++;
            }
        }
        return ans;
    }
}
