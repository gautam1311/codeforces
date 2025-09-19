package rated1100;

import java.util.Scanner;

public class YarikandArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

            int i=0;
            int j=0;
            long sum=0;
            long ans=Long.MIN_VALUE;

            while(j<n){
                if(sum<0){
                    sum=0;
                    i=j;
                }
                if(i<j){
                    if(((arr[j]^arr[j-1])&1)==1){
                        sum+=arr[j];
                    }
                    else{
                        sum=arr[j];
                        i=j;
                    }
                }
                else{
                    sum=arr[j];
                }
                ans=Math.max(ans,sum);
                j++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
