package arraypackage;

public class PairSum {
	//1 3 6 2 5 4 3 2 4  
	
	private static int pair;
	public static void main(String[] hitesh) {
		int arr[] = {1, 3, 6, 2, 5, 4, 3, 2, 4};
		int x=7;
	//	int pair=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == x) {
					pair+=1;
				}
			}
		}
		System.out.println(pair);
	}

}
