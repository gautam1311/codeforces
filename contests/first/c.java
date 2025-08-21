package contests.first;
import java.util.*;
public class c {
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
        long n=sc.nextLong();

        long total=0;
        long x=0;
        long power=1;

        while(n>0){
            long right=n%3;
            if(right!=0){
                long cost=(3*power)+(long)x*(power/3);
                total+=right*cost;
            }
            n/=3;
            power*=3;
            x++;
        }
        System.out.println(total);
    }
}
