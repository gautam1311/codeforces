package rated1000;

import java.util.Arrays;
import java.util.Scanner;

public class diwan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            solve(sc);
            t--;
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int both[][]=new int[n][2];
        for(int i=0;i<n;i++){
            both[i]=new int[]{arr[i],i};
        }
        // CORRECTED LINE: Use Integer.compare to prevent overflow.
        Arrays.sort(both, (a, b) -> Integer.compare(b[0], a[0]));

        int ans[]=new int[n+1];
        long total=0;
        int coordinate=1;
        ans[0]=0;
        for(int b[]:both){
            int idx=b[1];
            int val=b[0];
            ans[idx+1]=coordinate;

            total+=2*Math.abs(coordinate)*val;

            if(coordinate>0){
                coordinate=-coordinate;
            }
            else{
                coordinate=-coordinate+1;
            }
        }
        System.out.println(total);
        for(int i=0;i<=n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
