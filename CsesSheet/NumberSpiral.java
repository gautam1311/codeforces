import java.io.*;
import java.util.*;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long r = Math.max(x, y);
            long prev = (r - 1) * (r - 1);
            long ans;

            if ((r & 1) == 1) { // odd layer
                if (x == r) {
                    ans = prev + y;
                } else {
                    ans = r * r - x + 1;
                }
            } else { // even layer
                if (y == r) {
                    ans = prev + x;
                } else {
                    ans = r * r - y + 1;
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
