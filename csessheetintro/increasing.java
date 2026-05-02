package csessheetintro;

import java.util.Scanner;

public class increasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }

        long moves=0;
        long prev=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<prev){
                moves+=(prev-arr[i]);
            }
            else{
                prev=arr[i];
            }
        }
        System.out.println(moves);
        sc.close();
    }
}
