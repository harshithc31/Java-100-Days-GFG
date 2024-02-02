//All Unique Permutations of an array
//Given an array arr[] of length n. Find all possible unique permutations of the array in sorted order. A sequence A is greater than sequence B if there is an index i for which Aj = Bj for all j<i and Ai > Bi.

class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        Set<ArrayList<Integer>> result = new HashSet<>();
        ArrayList<Integer> current = new ArrayList<>();
        helper(arr, current, result);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(result);
        ans.sort((list1, list2) -> {
            for(int i=0;i<list1.size();i++){
                int cmp=list1.get(i).compareTo(list2.get(i));
                if(cmp!=0){
                    return cmp;
                }
            }
            return 0;
          });
        return ans;
    }
    
    static void helper(ArrayList<Integer> arr, ArrayList<Integer> current, Set<ArrayList<Integer>> result) {
        if (arr.size() == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            int curr = arr.get(i); 
            if(used.contains(curr)){
                continue;
            }
            ArrayList<Integer> newArr = new ArrayList<>(arr);//after removing curr
            newArr.remove(i);
            current.add(curr);
            used.add(curr);//set to check if list is already present or not
            helper(newArr, current, result);//call
            current.remove(current.size() - 1);//backtrack
        }
    }
}
