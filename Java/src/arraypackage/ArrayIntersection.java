package arraypackage;

public class ArrayIntersection {
	public static void main(String[] hitesh) {
		int arr1[] = {6, 1, 2, 4, 9, 0};
		int arr2[] = {2, 5, 3, 6, 9, 10, 15};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print(arr2[j]);
					arr2[j] = Integer.MAX_VALUE;
					break;
				}
			}
		}
	}

}
