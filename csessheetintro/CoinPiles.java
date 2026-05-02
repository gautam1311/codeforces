package csessheetintro;

import java.util.Scanner;

public class CoinPiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<t;i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if((a+b)%3==0 && 2*a>=b && 2*b>=a){
                str.append("YES\n");
            }
            else{
                str.append("NO\n");
            }
        }
        System.out.println(str);
        sc.close();
    }
}
