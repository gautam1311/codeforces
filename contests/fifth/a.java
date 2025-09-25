package contests.fifth;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int count1=0;
            int count2=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==-1){
                    count1++;
                }
                else if(arr[i]==0){
                    count2++;
                }
            }
            count2=count2;
            count1=2*(count1%2);

            System.out.println(count1+count2);
        }
    }
}
