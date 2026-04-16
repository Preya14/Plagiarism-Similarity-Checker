import java.util.*;

public class LCS {

    public static List<String> findLCS(String[] a, String[] b) {
        int m = a.length, n = b.length;
        int[][] dp = new int[m + 1][n + 1];

        // Build DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i - 1].equals(b[j - 1])) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Backtrack to get LCS words
        List<String> lcs = new ArrayList<>();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (a[i - 1].equals(b[j - 1])) {
                lcs.add(a[i - 1]);
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        Collections.reverse(lcs);
        return lcs;
    }

    public static double similarity(String[] a, String[] b, int lcsLength) {
        return (2.0 * lcsLength / (a.length + b.length)) * 100;
    }
}