package contests.thirteen;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int maxi=-1;
            int count=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>maxi){
                    maxi=arr[i];
                    count=0;
                }
            }
            for(int i=0;i<n;i++){
                if(maxi==arr[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();

    }
}
