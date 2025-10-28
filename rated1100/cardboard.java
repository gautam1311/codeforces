import java.util.Scanner;

public class CardBoard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        long c=sc.nextLong();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long low=1;
        long high=(long)1e9;
        long ans=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=(arr[i]+2*mid)*(arr[i]+2*mid);
                if(sum>c){
                    break;
                }
            }
            if(sum<=c){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
