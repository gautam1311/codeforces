package rated1100;

import java.util.HashMap;
import java.util.Scanner;

public class eraseFirst {
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
        String s=sc.next();
        long count=0;
        long dis[]=new long[n];
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
            if(map.get(ch)==1){
                count++;
            }
            dis[i]=count;
        }

        long ans=0;
        for(int i=0;i<n;i++){
            ans+=dis[i];
        }
        System.out.println(ans);
    }
}
