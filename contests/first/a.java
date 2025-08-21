package contests.first;
import java.util.*;
public class a {
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
        String a=sc.next();
        int m=sc.nextInt();
        String b=sc.next();
        String c=sc.next();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<m;i++){
            char add=b.charAt(i);
            char turn=c.charAt(i);
            if(turn=='V'){
                res.insert(0,add);
            }
            else{
                res.append(add);
            }
        }
        System.out.println(res.toString());
    }
}
