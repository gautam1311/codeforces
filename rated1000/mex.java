package rated1000;

import java.util.Scanner;

public class mex {
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
        long a=sc.nextLong();
        long b=sc.nextLong();

        long arrXor=calXor(a-1);

        if(arrXor==b){
            System.out.println(a);
        }
        else{
            long xorNeed=arrXor^b;
            if(xorNeed!=a){
                System.out.println(a+1);
            }
            else{
                System.out.println(a+2);
            }
        }
    }
    public static long calXor(long n){
        long rem=n%4;
        if(rem==0){
            return n;
        }
        else if(rem==1){
            return 1;
        }
        else if(rem==2){
            return n+1;
        }
        else{
            return 0;
        }
    }
}
