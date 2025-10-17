package contests.seventh;

import java.util.Arrays;
import java.util.Scanner;
//interatcive problem
public class d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int seq[]=new int[n+1];
            for(int i=1;i<=n;i++){
                seq[i]=sc.nextInt();
            }
            int l=sc.nextInt();
            int r=sc.nextInt();

            int arr[]=Arrays.copyOf(seq, n+1);
            for(int i=l;i<=r;i++){
                arr[i]++;
            }

            long sumS[]=new long[n+1];
            long sumA[]=new long[n+1];

            for(int i=1;i<=n;i++){
                sumS[i]=sumS[i-1]+seq[i];
                sumA[i]=sumA[i-1]+arr[i];
            }

            long sS = sumS[n];
            long sA = sumA[n];
            int k = (int) (sA - sS);

            int low = 1, high = n;
            int L = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                long diff = sumA[mid] - sumS[mid];
                if (diff == 0) {
                    low = mid + 1;
                } else {
                    L = mid;
                    high = mid - 1;
                }
            }
            int R = L + k - 1;
            System.out.println(L + " " + R);
        }
    }
}
