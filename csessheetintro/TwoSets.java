package csessheetintro;

import java.util.*;

public class TwoSets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=1L*n*(n+1)/2;
        if(sum%2==1){
            System.out.println("NO");
            return;
        }

        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        long target=sum/2;

        for(int i=n;i>=1;i--){
            if(target>=i){
                l1.add(i);
                target-=i;
            }
            else{
                l2.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("YES\n");

        sb.append(l1.size()).append("\n");
        for (int x : l1) sb.append(x).append(" ");
        sb.append("\n");

        sb.append(l2.size()).append("\n");
        for (int x : l2) sb.append(x).append(" ");
        sb.append("\n");

        System.out.print(sb.toString());
    }
}
