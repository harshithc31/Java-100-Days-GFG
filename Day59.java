//Paths from root with a specified sum
//Given a Binary tree and a sum S, print all the paths, starting from root, that sums upto the given sum. Path not necessarily end on a leaf node.
/*
Example 1:
Input : 
sum = 8
Input tree
         1
       /   \
     20      3
           /    \
         4       15   
        /  \     /  \
       6    7   8    9      

Output :
1 3 4
Explanation : 
Sum of path 1, 3, 4 = 8.   */

class Solution {
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        // code here
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        solve(root, sum, sol, new LinkedList<>());
        return sol;
    }
    
    private static void solve(Node root, int sum, ArrayList<ArrayList<Integer>> sol,
                List<Integer> currSol) {
        if(root == null) {
            return;
        }
        
        currSol.add(root.data);
        
        sum-= root.data;
        if(sum == 0) {
            sol.add(new ArrayList<>(currSol));
        }
        
        solve(root.left, sum, sol, currSol);
        solve(root.right, sum, sol, currSol);
        currSol.remove(currSol.size()-1);
    }

}
