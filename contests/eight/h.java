package contests.eight;

import java.util.*;

public class h {
    static int n,k;
    static List<List<Integer>> graph;
    static int[] subtree;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        n = sc.nextInt();
        k = sc.nextInt();

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        subtree = new int[n + 1];
        dfs(1, -1);

        long ans = n; 

        for (int i = 2; i <= n; i++) {
            long sub = subtree[i];      
            long other = n - sub;          
            if (sub >= k){
                ans += other;
            }
            if (other >= k){
                ans += sub;
            } 
        }
        System.out.println(ans);
    }
    public static void dfs(int node, int parent) {
        subtree[node] = 1;
        for (int child : graph.get(node)) {
            if (child != parent) {
                dfs(child, node);
                subtree[node] += subtree[child];
            }
        }
    }
}
