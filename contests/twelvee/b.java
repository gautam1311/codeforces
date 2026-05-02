package contests.twelvee;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long ans=solve(arr);
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    ans=Math.max(ans,solve(arr));

                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.println(ans);
        }
    }
    public static long solve(int arr[]){
        long sum=0;
        int maxi=0;
        for(int a:arr){
            maxi=Math.max(maxi,a);
            sum+=maxi;
        }
        return sum;
    }
}
