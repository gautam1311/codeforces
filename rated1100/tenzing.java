
import java.util.*;

public class tenzing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        long x=sc.nextLong();
        List<Long>[] list=new ArrayList[3];
        for(int i=0;i<3;i++){
            list[i]=new ArrayList<>();
            long s=0;
            list[i].add(s);
            for(int j=0;j<n;j++){
                long a=sc.nextLong();
                if((s|a)!=s){
                    s|=a;
                    list[i].add(s);
                }
            }
        }

        boolean found=false;
        for(long a:list[0]){
            for(long b:list[1]){
                for(long c:list[2]){
                    if((a|b|c)==x){
                        found=true;
                        break;
                    }
                }
                if (found) break;
            }
            if (found) break;
        }
        System.out.println(found?"YES":"NO");
    }
}
