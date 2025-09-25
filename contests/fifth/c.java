package contests.fifth;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int k=sc.nextInt();

        int count[]=new int[n+1];
        for(int i=0;i<n;i++){
            count[sc.nextInt()]++;
        }

        int kcount=count[k];
        int miss=0;
        for(int i=0;i<k;i++){
            if(count[i]==0){
                miss++;
            }
        }
        System.out.println(kcount+Math.max(0,miss-kcount));
    }
}
