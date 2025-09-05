package rated1000;

import java.util.Scanner;

public class ancComp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        long a=sc.nextLong();
        long b=sc.nextLong();

        long rA=a;
        long rB=b;
        while(rA%2==0){
            rA/=2;
        }
        while(rB%2==0){
            rB/=2;
        }
        if(rA!=rB){
            System.out.println(-1);
            return;
        }
        else{
            a /= rA;
            b /= rB;
            long expA = (long)(Math.log(a) / Math.log(2));
            long expB = (long)(Math.log(b) / Math.log(2));
            long diff = Math.abs(expA - expB);
            long ans = (diff + 2) / 3; // ceil(diff / 3)
            System.out.println(ans);
        }
    }
}
