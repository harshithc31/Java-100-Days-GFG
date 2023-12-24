// Leaders in an array
  class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int max = arr[n-1];
        ans.add(max);
        
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] >= max) {
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.sort(ans, Collections.reverseOrder());
        return ans;
    }
}
