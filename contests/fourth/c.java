package contests.fourth;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        long a=sc.nextLong();
        long b=sc.nextLong();

        long maxi;
        if(a%2!=0){
            if(b%2!=0){
                maxi=a*b+1;
            }
            else{
                if(b%4==2){
                    maxi=-1;
                }
                else{
                    long sum1=a*2+b/2;
                    long sum2=a*(b/2)+2;
                    maxi=Math.max(sum1,sum2);
                }
            }
        }
        else{
            if(b%2!=0){
                maxi=-1;
            }
            else{
                long sum1=a+b;
                long sum2=a*(b/2)+2;
                maxi=Math.max(sum1,sum2);
            }
        }
        System.out.println(maxi);
    }  
}
