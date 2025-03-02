/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// https://www.onlinegdb.com/edit/aGSUpziOh
// int-pomegranates-2.java


import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");

		int[] candySales = new int[3];
		candySales[0] = 30;
		candySales[1] = 60;
		candySales[2] = 80;

		for (int i = 0; i < candySales.length; i++) {
			System.out.println("*=" + candySales[i]);
		}

		// 2 D arrays in Java

		// declare the variable and allocate memory
		int[][] myPita = new int[4][2];
		myPita[2][1] = 99;
		myPita[3][0] = 55;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(myPita[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("____");

		// 3 D int array
		// declare the variable and allocate memory
		int[][][] myGhriba = new int[4][2][3];
		myGhriba[2][1][2] = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(myGhriba[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("____");
		}

		// print int array
		int[] intArray = { 7, 9, 5, 1, 3 };
		System.out.println( "$="+Arrays.toString(intArray));
		
		System.out.println("____");
	
		// int max value
		

		int maxInt = Integer.MAX_VALUE;
		System.out.println("Max int: " + maxInt);

		int result = maxInt + 1;
		System.out.println("Result: " + result);

        // Output:
        // Max int: 2147483647
        // Result: -2147483648

	}
}
