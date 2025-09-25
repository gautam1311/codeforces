package contests.fifth;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long h=sc.nextLong();
            long d=sc.nextLong();
            solve(h,d);
        }
        sc.close();
    }
    public static void solve(long h, long d){
        long low=d;
        long high=4000000000L;
        long ans=high;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(check(mid,h,d)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(long t,long h ,long d){
        if(t<d){
            return false;
        }

        long rest=t-d;
        long seg=rest+1;

        long normalseg=d/seg;
        long incseg=d%seg;

        long cost1=normalseg*(normalseg+1)/2;
        long cost2=(normalseg+1)*(normalseg+2)/2;

        long total=incseg*cost2+(seg-incseg)*cost1;

        return (h-1+rest)>=total;

    }
}
