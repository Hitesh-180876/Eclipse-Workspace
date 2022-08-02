package graph;

import java.util.Scanner;

public class Graph {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int e = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for(int i=0; i<e; i++) {
			int sv = sc.nextInt();
			int ev = sc.nextInt();
			
			matrix[sv][ev] = 1;
		}
		
		
		
		
		
	}
}
