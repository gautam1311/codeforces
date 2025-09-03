package rated1000;

import java.util.*;
public class diff {
    public static void main(String[] args) {
        ArrayList<Long> primes=new ArrayList<>();
        for(long i=2;i<=100000;i++){
            boolean isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                primes.add(i);
            }
        }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            solve(sc,primes);
            t--;
        }
        sc.close();
    }
    public static void solve(Scanner sc,ArrayList<Long> primes){
        int d=sc.nextInt();

        long p=-1;
        for(long pri:primes){
            if(pri>=(1+d)){
                p=pri;
                break;
            }
        }

        long q=-1;
        for(long pri:primes){
            if(pri>=(p+d)){
                q=pri;
                break;
            }
        }

        long ans=Math.min(p*p*p,p*q);
        System.out.println(ans);
    }
}
