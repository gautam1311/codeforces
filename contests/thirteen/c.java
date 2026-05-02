package contests.thirteen;

import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (n % 2 != 0) {
                System.out.println("no");
                continue;
            }
            
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                char curr = s.charAt(i);
                
                if (!stack.isEmpty() && stack.peek() == curr) {
                    stack.pop(); 
                } else {
                    stack.push(curr); 
                }
            }
            
            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
