package csessheetintro;

import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long count = 0;
        for (long i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        System.out.println(count);
    }
}
