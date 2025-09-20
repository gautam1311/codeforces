import java.util.Scanner;

public class BitStrings {
    static final long MOD = 1000000007;

    // Recursive fast exponentiation
    static long modPow(long base, long exp, long mod) {
        if (exp == 0) return 1;
        long half = modPow(base, exp / 2, mod);
        long ans = (half * half) % mod;
        if (exp % 2 == 1) {
            ans = (ans * base) % mod;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        long ans = modPow(2, n, MOD);
        System.out.println(ans);
    }
}

