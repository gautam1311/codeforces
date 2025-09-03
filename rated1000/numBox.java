package rated1000;

import java.util.Scanner;

public class numBox {
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
        int m=sc.nextInt();

        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int neg=0;
        int sum=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]<0){
                    neg++;
                }
                mini=Math.min(mini,Math.abs(arr[i][j]));
                sum+=Math.abs(arr[i][j]);
            }
        }

        if(neg%2==0){
            System.out.println(sum);
        }
        else{
            System.out.println(sum-2*mini);
        }
    }
}
