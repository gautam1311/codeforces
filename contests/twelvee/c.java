package contests.twelvee;

import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashSet<Long> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextLong());
            }

            ArrayList<Long> arr = new ArrayList<>(set);
            Collections.sort(arr);

            int ans = 0;
            int i = 0;

            while (i < arr.size()) {
                int j = i;
                while (j + 1 < arr.size() && arr.get(j + 1) == arr.get(j) + 1) {
                    j++;
                }
                ans = Math.max(ans, j - i + 1);
                i = j + 1;
            }

            System.out.println(ans);
        }
    }
}
