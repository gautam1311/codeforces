package contests.seventh;

import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();

            List<Integer> zero=new ArrayList<>();
            List<Integer> ones=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    zero.add(i+1);
                }
                else{
                    ones.add(i+1);
                }
            }

            List<Integer> p;
            if(!zero.isEmpty()){
                p=zero;
            }
            else{
                p=ones;
            }

            System.out.println(p.size());
            if(!p.isEmpty()){
                for(int i=0;i<p.size();i++){
                    System.out.print(p.get(i));
                    if(i+1<p.size()){
                        System.out.print(" ");
                    }
               }
               System.out.println("");
            }
        }
    }
}
