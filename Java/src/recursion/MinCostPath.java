package recursion;

public class MinCostPath {
	static int minCost(int[][] cost, int m, int n) {
		
		if(n<0 || m<0) {
			return Integer.MAX_VALUE;
		}
		if(n==0 && m==0) {
			return cost[m][n];
		}
		
		return cost[m][n] + Math.min(minCost(cost, m-1, n-1), Math.min(minCost(cost, m-1, n), minCost(cost, m, n-1)));
	}
	public static void main(String[] args) {
		int cost[][] = {{348, 391},
		          		{618, 193}};
		
		int m= cost.length-1;
		int n = cost[0].length-1;
		int res = minCost(cost, m, n);
		System.out.println(res);
	}
}
