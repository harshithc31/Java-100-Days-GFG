//Course Schedule
//There are a total of n tasks you have to pick, labelled from 0 to n-1. Some tasks may have prerequisite tasks, for example to pick task 0 you have to first finish tasks 1, which is expressed as a pair: [0, 1]
//Given the total number of n tasks and a list of prerequisite pairs of size m. Find a ordering of tasks you should pick to finish all tasks.
//Note: There may be multiple correct orders, you just need to return any one of them. If it is impossible to finish all tasks, return an empty array. Driver code will print "No Ordering Possible", on returning an empty array. Returning any correct order will give the output as 1, whereas any invalid order will give the output 0. 

class Solution {
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) {
        // add your code here
        int[] inDegree = new int[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (ArrayList<Integer> prerequisite : prerequisites) {
            int u = prerequisite.get(1);
            int v = prerequisite.get(0);
            
            inDegree[v]++;
            graph.get(u).add(v);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            result.add(u);
            index++;
            
            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    queue.add(v);
                }
            }
        }
        
        if (index == n) {
            int[] order = new int[n];
            for (int i = 0; i < n; i++) {
                order[i] = result.get(i);
            }
            
            return order;
        } else {
            return new int[0];
        }
    }
}
