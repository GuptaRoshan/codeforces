package dp;

import java.util.Arrays;
import java.util.Scanner;

public class Vitamins {

    private static int getMask(String v) {
        int mask = 0;
        if (v.contains("A")) mask |= 1;
        if (v.contains("B")) mask |= 2;
        if (v.contains("C")) mask |= 4;
        return mask;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] dp = new int[8]; // Min cost to obtain exactly set of vitamins
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int cost = scanner.nextInt();
            String v = scanner.next();
            int mask = getMask(v);

            int[] prev = dp.clone();

            for (int old = 0; old < 8; old++) {
                if (prev[old] == Integer.MAX_VALUE) continue;
                int newMask = mask | old;

                dp[newMask] = Math.min(dp[newMask], prev[old] + cost);
            }
        }

        if (dp[7] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[7]);
        }

    }

}
