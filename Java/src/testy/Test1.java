package testy;

public class Test1 {
	public static int minCoins(int coins[], int length, int V) {
		
		if(V==0) {
			return 0;
		}
		int output = Integer.MAX_VALUE;
		
		for(int i=0; i<=length; i++) {
			if(coins[i] <=V) {
				int recursionOutput = minCoins(coins, length, V-coins[i]);
				
				if(recursionOutput != Integer.MAX_VALUE && recursionOutput +1< output) {
					output = recursionOutput+1;
				}
			}
		}
		
		return output;
				
	}
	public static void main(String[] args) {
		int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		int V = 49;
		int length = coins.length-1;
		
		int ans = minCoins(coins, length, V);
		System.out.println(ans);
	}

}
