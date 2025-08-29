package rated1000;

import java.util.Scanner;

public class adddiv {
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

    int ans=Integer.MAX_VALUE;
    for(int add=0;add<32;add++){
        int op=add;
        long new_b=b+add;
        if(new_b==1){
            continue;
        }
        long copy_a=a;
        while(copy_a>0){
            op++;
            copy_a=copy_a/new_b;
        }
        ans=Math.min(ans,op);
    }
    System.out.println(ans);
   }
}
