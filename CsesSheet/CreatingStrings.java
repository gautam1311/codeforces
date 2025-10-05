
import java.util.*;

public class CreatingStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        char path[]=new char[n];
        int freq[]=new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        List<String> ans=new ArrayList<>();

        solve(0,path,freq,n,ans);

        System.out.println(ans.size());
        for(String str:ans){
            System.out.println(str);
        }

    }
    public static void solve(int idx, char path[], int freq[], int n, List<String> ans){
        if(idx==n){
            ans.add(new String(path));
            return;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                path[idx]=(char)(i+'a');
                freq[i]--;
                solve(idx+1,path,freq,n,ans);
                freq[i]++;
            }

        }
    }
}
