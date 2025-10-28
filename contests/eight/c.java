package contests.eight;

import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        long arr[]=new long[n];
        boolean even=false;
        boolean odd=false;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            if(arr[i]%2==0){
                even=true;
            }
            else{
                odd=true;
            }
        }
        if(even && odd){
            Arrays.sort(arr);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
