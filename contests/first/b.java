package contests.first;

import java.util.*;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            solve(sc);
            t--;
        }
    }
    public static void solve(Scanner sc){
        long n=sc.nextLong();
        long power=10;
        List<Long> sol=new ArrayList<>();
        for(int i=1;i<=18;i++){
            long divisor=power+1;
            if(divisor>n){
                break;
            }
            if(n%divisor==0){
                sol.add(n/divisor);
            }
            if(power>Long.MAX_VALUE/10){
                break;
            }
            power*=10;
        }
        if(sol.isEmpty()){
            System.out.println(0);
        }
        else{
            Collections.sort(sol);
            System.out.print(sol.size());

            for(Long a:sol){
                System.out.print(" "+a);
            }
            System.out.println();
        }
    }
}
