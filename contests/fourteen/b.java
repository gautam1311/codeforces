package contests.fourteen;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int count = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    count++;
                } else {
                    count--;
                }
            }

            if (count == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}