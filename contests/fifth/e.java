package contests.fifth;


import java.util.*;

public class e {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long k1 = count(a, n, k, l, r);
        long k2 = count(a, n, k - 1, l, r);

        System.out.println(k1 - k2);
    }
    public static long count(int[] a, int n, int d, int l, int r){
        if (d < 1) {
            return 0;
        }

        long total = 0;
        int left = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < n; right++) {
            freq.put(a[right], freq.getOrDefault(a[right], 0) + 1);

            while (freq.size() > d) {
                freq.put(a[left], freq.get(a[left]) - 1);
                if (freq.get(a[left]) == 0) {
                    freq.remove(a[left]);
                }
                left++;
            }
            int maxi = right - left + 1;
            int upperBound = Math.min(maxi, r);
            int lowerBound = l;

            if (upperBound >= lowerBound) {
                total += (long) (upperBound - lowerBound + 1);
            }
        }
        return total;
    }
}
