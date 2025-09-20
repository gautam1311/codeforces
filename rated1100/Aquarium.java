package rated1100;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long x=sc.nextLong();
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

            long start=1;
            long end=(long)1e12;
            long ans=-1;
            while(start<=end){
                long mid=start+(end-start)/2;
                if(check(arr,mid,x)){
                    ans=mid;
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
    public static boolean check(long arr[], long mid, long x){
        long unit=0;
        for(int i=0;i<arr.length;i++){
            if(mid>arr[i]){
                unit+=(mid-arr[i]);
                if(unit>x){
                    return false;
                }
            }
        }
        return true;
    }
}
