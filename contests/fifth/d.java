package contests.fifth;
import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextInt(); 
            String s = sc.next();
            System.out.println(Math.min(solve('a', s), solve('b', s)));
        }
        sc.close();
    }

    public static long solve(char ch, String s) {
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                pos.add(i);
            }
        }

        if (pos.size() <= 1) {
            return 0;
        }

        List<Integer> off = new ArrayList<>();
        for (int i = 0; i < pos.size(); i++) {
            off.add(pos.get(i) - i);
        }

        int mid = off.get(off.size() / 2);
        long total = 0;
        for (int val : off) {
            total += Math.abs(val - mid);
        }
        return total;
    }
}
