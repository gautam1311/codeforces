
import java.util.Scanner;

public class sortSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            int c1=-1;
            int c2=-1;
            for(int i=0;i<n;i++){
                if(arr1[i]!=arr2[i]){
                    if(c1==-1){
                        c1=i;
                    }
                    else{
                        c2=i;
                        break;
                    }
                }
            }
            int i=c1-1;
            while(i>=0){
                if(arr2[i]<=arr2[i+1]){
                    i--;
                }
                else{
                    break;
                }
            }
            c1=i+1;
            if(c2==-1){
                c2=n-1;
            }
            i=c2+1;
            while(i<n){
                if(arr2[i]>=arr2[i-1]){
                    i++;
                }
                else{
                    break;
                }
            }
            c2=i-1;
            System.out.println((c1+1)+" "+(c2+1));


        }
    }
}
