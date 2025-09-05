package rated1000;

import java.util.Scanner;

public class moveBrac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        String s=sc.next();
        long sum=0;
        long op=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                sum++;
            }
            else{
                sum--;
            }
            if(sum<0){
                sum=0;
                op++;
            }
        }
        System.out.println(op);
    }
}
