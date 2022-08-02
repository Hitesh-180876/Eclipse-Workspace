package stack;

public class Test {
	public static boolean canFormed(String a, String b) {
		int length = a.length();
		while(length>0) {
			for(int i=0; i<length-1; i++) {
				char temp = a.charAt(length-1-i);
				b+=temp;
				b+=a.charAt(i);	
			}
			if(a==b) {
				return true;
			}
			length--;
		}
		return false;
		
	}
	public static void main(String[] args) {
		String a = "erbottlewat";
		String b = "waterbottle";
		/*
		 * boolean ans = canFormed(a, b); System.out.println(ans); String ans1 = new
		 * String();
		 */
		
		String ans = new String();
		int i = 1;
		while(ans.equals(b)) {
			ans = a.substring(i, a.length())+a.substring(0, i);
			i++;
		}
		
	}
}
