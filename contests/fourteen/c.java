package contests.fourteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            List<Integer> six=new ArrayList<>();
            List<Integer> two=new ArrayList<>();
            List<Integer> un=new ArrayList<>();
            List<Integer> three=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x%6==0){
                    six.add(x);
                }
                else if(x%2==0){
                    two.add(x);
                }
                else if(x%3==0){
                    three.add(x);
                }
                else{
                    un.add(x);
                }
            }
            StringBuilder str=new StringBuilder();
            for(int i:six){
                str.append(i+" ");
            }
            for(int i:two){
                str.append(i+" ");
            }
            for(int i:un){
                str.append(i+" ");
            }
            for(int i:three){
                str.append(i+" ");
            }
            System.out.println(str.toString());
        }
    }
}
