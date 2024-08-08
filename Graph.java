// import java.util.*;

// class Solution {
//     // Function to return Breadth First Traversal of given graph.
//     public ArrayList<Integer> bfsOfGraph(int V,
//             ArrayList<ArrayList<Integer>> adj) {

//         ArrayList<Integer> bfs = new ArrayList<>();
//         boolean vis[] = new boolean[V];
//         Queue<Integer> q = new LinkedList<>();

//         q.add(0);
//         vis[0] = true;

//         while (!q.isEmpty()) {
//             Integer node = q.poll();
//             bfs.add(node);

//             // Get all adjacent vertices of the dequeued vertex s
//             // If a adjacent has not been visited, then mark it
//             // visited and enqueue it
//             for (Integer it : adj.get(node)) {
//                 if (vis[it] == false) {
//                     vis[it] = true;
//                     q.add(it);
//                 }
//             }
//         }

//         return bfs;
//     }

//     public static void main(String args[]) {

//         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//         for (int i = 0; i < 5; i++) {
//             adj.add(new ArrayList<>());
//         }
//         adj.get(0).add(1);
//         adj.get(1).add(0);
//         adj.get(0).add(4);
//         adj.get(4).add(0);
//         adj.get(1).add(2);
//         adj.get(2).add(1);
//         adj.get(1).add(3);
//         adj.get(3).add(1);

//         Solution sl = new Solution();
//         ArrayList<Integer> ans = sl.bfsOfGraph(5, adj);
//         int n = ans.size();
//         for (int i = 0; i < n; i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//     }
// }

import java.util.*;

class Solution {

    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj,
            ArrayList<Integer> ls) {

        // marking current node as visited
        vis[node] = true;
        ls.add(node);

        // getting neighbour nodes
        for (Integer it : adj.get(node)) {
            if (vis[it] == false) {
                dfs(it, vis, adj, ls);
            }
        }
    }

    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // boolean array to keep track of visited vertices
        boolean vis[] = new boolean[V + 1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }

    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        Solution sl = new Solution();
        ArrayList<Integer> ans = sl.dfsOfGraph(5, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}