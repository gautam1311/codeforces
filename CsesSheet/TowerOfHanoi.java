
import java.util.*;

public class TowerOfHanoi {
    static List<String> moves=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve(n,1,3,2);
        System.out.println(moves.size());
        for(String str:moves){
            System.out.println(str);
        }
        sc.close();
    }
    public static void solve(int n, int from, int to, int aux){
        if(n==0){
            return;
        }
        solve(n-1,from,aux,to);
        moves.add(from+" "+to);
        solve(n-1,aux,to,from);
    }
}
