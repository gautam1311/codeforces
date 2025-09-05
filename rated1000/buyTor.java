package rated1000;

import java.util.Scanner;

public class buyTor {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            solve(sc);
            t--;
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        long x=sc.nextLong();
        long y=sc.nextLong();
        long k=sc.nextLong();

        long trade1=k*y+k-1;
        long div=x-1;

        long total = (trade1 + div - 1) / div;
        total+=k;
        System.out.println(total);
    }
}
