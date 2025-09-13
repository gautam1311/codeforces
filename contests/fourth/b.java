package contests.fourth;

import java.util.Scanner;

public class b {
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

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        StringBuilder str=new StringBuilder();

        for(int i=0;i<n;i++){
            int per=n-arr[i]+1;
            str.append(per);
            if(i<n-1){
                str.append(" ");
            }
        }
        System.out.println(str.toString());
    }
}
