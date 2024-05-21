package TwoDArray;

import java.util.Scanner;

// Take a matrix as input from the user. Search for the number x and print the indices at 
// which will occurs
public class QueTwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int numbers[][] = new int[rows][columns];
		for(int i =0; i<rows;i++) {
			for(int j=0; j<columns;j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		for(int i=0; i<rows;i++) {
			for(int j=0; j<columns;j++) {
				if(numbers[i][j] == x) {
					System.out.println("X found at location ("+ i+ "," + j + ")");
				}
			}
		}
	}

}
