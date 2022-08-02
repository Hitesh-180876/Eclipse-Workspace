package arraypackage;
import java.util.Scanner;


public class InputArray {
	public static void printPattern() {
		int N = 6;
		int arr[] = new int[N];
		
		for(int i=0, j=0; j<N && i<N; i++, j++) {
			arr[i] = i;
			i++;
			j++;
			
		}
	}
	public static void elementInArray(int arr[], int ele) {
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == ele) {
				System.out.println("element found at index" + i);
				return;
			}
		}
		System.out.println("element not found in array");
	}
	public static int maxInArray(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		int max = maxInArray(arr);
		System.out.println(max);
		elementInArray(arr, 10);
		sc.close();
	}

}
