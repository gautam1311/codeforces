package contests.fourth;

import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        int k=sc.nextInt();
        long x=sc.nextInt();

        HashSet<Long> curr=new HashSet<>();
        curr.add(x);

        for(int i=0;i<k;i++){
            HashSet<Long> newSet=new HashSet<>();
            for(long val:curr){
                newSet.add(val*2);

                if((val-1)%3==0){
                    long val1=(val-1)/3;
                    if(val1>0 && val%2!=0){
                        newSet.add(val1);
                    }
                }
            }
            curr=newSet;
        }
        System.out.println(curr.iterator().next());

    }
}
