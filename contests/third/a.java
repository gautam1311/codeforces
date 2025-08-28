package contests.third;

import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            solve(sc);
            t--;
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();

        boolean isSame=(n%2==b%2);
        StringBuilder str=new StringBuilder();
        if(isSame){
            boolean againSame=(n%2==a%2)||(a<=b);

            if(againSame){
                str.append("YES\n");
            }
            else{
                str.append("NO\n");
            }
        }
        else{
            str.append("NO\n");
        }
        System.out.println(str.toString());
    }
}
