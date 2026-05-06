paackage csessheetintro;

import java.util.Scanner;

public class RaabGame {
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
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a+b>n){
            System.out.println("NO");
            return;
        }
        if((a==0 || b==0)&& (a+b!=0)){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");

        StringBuilder str=new StringBuilder();
        for(int i=1;i<=n;i++){
            str.append(i).append(" ");
        }
        System.out.println(str.toString().trim());
        str.setLength(0);
        for(int i=a+1;i<=a+b;i++){
            str.append(i).append(" ");
        }
        for(int i=1;i<=a;i++){
            str.append(i).append(" ");
        }
        for(int i=a+b+1;i<=n;i++){
            str.append(i).append(" ");
        }
        System.out.println(str.toString().trim());
    }
}
