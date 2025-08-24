package rated1000;
import java.util.*;
public class black {
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
        int k=sc.nextInt();
        String s=sc.next();
        int left=0;
        int count=0;
        int mini=Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            if(s.charAt(right)=='W'){
                count++;
            }
            if(right-left+1==k){
                mini=Math.min(mini,count);
                if(s.charAt(left)=='W'){
                    count--;
                }
                left++;
            }
        }
        System.out.println(mini);
    }
}
