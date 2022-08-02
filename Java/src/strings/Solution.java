package strings;

class Solution{
	public static void printDup(String s) {
		int arr[] = new int[256];
		
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)]++;
		}
		for(int i=0; i<256; i++) {
			if(arr[i] > 1) {
				System.out.println((i));
			}
		}
	}
	public static void main(String[] args) {
		String s = "abcdbad";
		printDup(s);
		
	}
}