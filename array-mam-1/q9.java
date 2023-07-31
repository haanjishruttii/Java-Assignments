//9.Initialize and print all elements of a 2D array.

import java.util.Scanner;
class Ass9 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[][] = new int[3][3];
	System.out.println("Enter the elements");
	for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr.length; j++) {
	arr[i][j] = sc.nextInt();
	}
	}
	System.out.println("The data you entered");
	for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr.length; j++) {
	System.out.print(" " + arr[i][j]);
	}
	System.out.println();
	}
	}
}
