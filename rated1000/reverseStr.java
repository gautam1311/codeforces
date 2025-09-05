package rated1000;

import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        boolean flag=false;
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)>s.charAt(i)){
                flag=true;
                System.out.println("YES");
                System.out.println((i)+" "+(i+1));
                break;
            }
        }
        if(!flag){
            System.out.println("NO");
        }
        sc.close();
    }
}
