package recursion;

public class LongestCommonSubsequence {
	public static int lcs1(String str1, String str2, int m, int n, int[][] dp) {
		System.out.println("Hello");
		if(m==0 || n==0) {
			return 0;
		}
		if(dp[m][n] != -1) {
			return dp[m][n];
		}
		if(str1.charAt(m-1) == str2.charAt(n-1)) {
		dp[m][n] = 1+lcs1(str1, str2, m-1,  n-1, dp);
		return dp[m][n];
		}
		
		dp[m][n] = Math.max(lcs1(str1, str2, m, n-1, dp), lcs1(str1, str2, m-1, n, dp));
		return dp[m][n];
	}
	public static int lcs(String str1, String str2, int m, int n) {
		if(m == 0 || n==0) {
			return 0;
		}
		
		else if(str1.charAt(m-1) == str2.charAt(n-1)) {
			return 1+lcs(str1, str2, m-1, n-1);
		}
		else {
			return Math.max(lcs(str1, str2, m-1, n), lcs(str1, str2, m, n-1));
		}
	}
	public static void main(String[] args) {
		String str1 = "AGGTAB";
		String str2 = "GXTXAY";
		int m = str1.length();
		int n = str2.length();
		int subsequence = lcs(str1, str2, m, n);
		System.out.println(subsequence);
		int[][] dp = new int[m+1][n+1];
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				dp[i][j] = -1;
			}
		}
		for(int i=0;i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		int subsequenceMemo = lcs1(str1, str2, m, n, dp);
		
		System.out.println(subsequenceMemo);
	}

}
