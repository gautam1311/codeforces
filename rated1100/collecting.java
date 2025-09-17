package rated1100;

import java.util.Arrays;
import java.util.Scanner;

public class collecting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            solve(sc);
            t--;
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        Pair[] arr=new Pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new Pair(sc.nextLong(),i);
        }
        Arrays.sort(arr);

        long[] pre = new long[n];
        pre[0] = arr[0].val;
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + arr[i].val;
        }

        long[] ans = new long[n];

        for (int i = 0; i < n; i++) {
            int j = i;
            int found = i; // elements smaller than arr[i]
            while (j < n) {
                long key = pre[j] + 1;
                int idx = lowerBound(arr, key);
                idx--; // move to last <= pre[j]
                if (idx == j) break;
                found += idx - j;
                j = idx;
            }
            ans[arr[i].idx] = found;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
    public static class Pair implements Comparable<Pair>{
        long val;
        int idx;
        Pair(long val,int idx){
            this.val=val;
            this.idx=idx;
        }
        public int compareTo(Pair o){
            if(this.val==o.val){
                return Integer.compare(this.idx,o.idx);
            }
            return Long.compare(this.val,o.val);
        }
    }
    static int lowerBound(Pair[] arr, long key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid].val < key) {
            low = mid + 1;
            }
            else{
            high = mid;
            }
        }
        return low;
    }
}
