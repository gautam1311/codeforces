package csessheetintro;
import java.util.*;

public class GrayCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int total = 1 << n; // 2^n
        for (int i = 0; i < total; i++) {
            int gray = i ^ (i >> 1);
            String bin = Integer.toBinaryString((1 << n) | gray).substring(1);
            System.out.println(bin);
        }
    }
}
