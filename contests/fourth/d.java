package contests.fourth;

import java.util.*;

public class d {
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
        List<Integer> groups[]=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            groups[i]=new ArrayList<>();
        }

        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            groups[b].add(i);
        }

        for(int i=1;i<=n;i++){
            if(!groups[i].isEmpty() && groups[i].size()%i!=0){
                System.out.println(-1);
                return;
            }
        }

        int arr[]=new int[n];
        int val=1;

        for(int freq=1;freq<=n;freq++){
            List<Integer>  ind=groups[freq];

            for(int i=0;i<ind.size();i++){
                int idx=ind.get(i);
                arr[idx]=val;

                if((i+1)%freq==0){
                    val++;
                }
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(arr[i]).append(i == n - 1 ? "" : " ");
        }
        System.out.println(str.toString());
    }
}
