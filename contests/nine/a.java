package contests.nine;

import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean can=true;
        Arrays.sort(arr);
        for(int i=1;i<n-1;i+=2){
            if(arr[i]!=arr[i+1]){
                can=false;
            }
        }
        if(can){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
