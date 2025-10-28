package contests.eight;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        String t=sc.next();
        String s=sc.next();
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            freq[t.charAt(i)-'a']--;
        }
        boolean flag=true;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
