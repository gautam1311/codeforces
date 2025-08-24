package contests.second;
import java.util.*;
public class A {
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
        boolean possible=false;
        HashSet<Integer> set=new HashSet<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(!set.add(arr[i])){
                possible=true;
            }
        }
        
        if(possible){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
