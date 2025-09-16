
import java.util.Scanner;

public class repetition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        long maxi=Long.MIN_VALUE;
        long count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                maxi=Math.max(maxi,count);
                count=1;
            }
        }
        maxi=Math.max(maxi,count);
        System.out.println(maxi);
    }
}
