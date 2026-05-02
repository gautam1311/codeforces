package csessheetintro;

import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        for(int i=1;i<=K;i++){
            System.out.println(solve(i));
        }

    }
    public static long solve(int K){
        // Total number of ways two knights can be placed on
        // the chessboard
        long totalWays = ((long) K * K * (K * K - 1)) / 2;

        // Number of ways two knights can attack each other
        long attackingWays = 4 * (K - 1) * (K - 2);

        // Number of ways two knights can be placed without
        // attacking each other
        long ans = totalWays - attackingWays;

        // Return the result for the current chessboard size K
        return ans;
    }
}
