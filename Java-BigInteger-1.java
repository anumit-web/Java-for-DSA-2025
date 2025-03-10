/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// BigInteger

import java.math.BigInteger;

// https://www.onlinegdb.com/edit/TcnyUQgKU

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");

		// to store numbers bigger than int or long
		// provides all methods from the java.lang.Math package


		// Declaration and Initialization
		BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
		BigInteger bigInt2 = BigInteger.valueOf(9876543210L);
		BigInteger bigInt3 = new BigInteger("1010", 2); // from binary string

		// print big integers
		System.out.println("BigInteger from String: " + bigInt1);
		System.out.println("BigInteger from String: " + bigInt2);
		System.out.println("BigInteger from String: " + bigInt3);


		// Arithmetic Operations
		BigInteger sum = bigInt1.add(bigInt2);
		BigInteger difference = bigInt1.subtract(bigInt2);
		BigInteger product = bigInt1.multiply(bigInt2);
		BigInteger quotient = bigInt1.divide(bigInt2);
		BigInteger remainder = bigInt1.remainder(bigInt2);
		BigInteger power = bigInt1.pow(5);

		// Using a constant in big integer
		BigInteger zero = BigInteger.ZERO;
		BigInteger one = BigInteger.ONE;
		BigInteger ten = BigInteger.TEN;

		System.out.println("Zero: " + zero);
		System.out.println("One: " + one);
		System.out.println("Ten: " + ten);


		//
		BigInteger absoluteValue = bigInt1.abs();
		BigInteger negateValue = bigInt1.negate();
		int signum = bigInt1.signum(); // -1, 0, or 1
		BigInteger gcd = bigInt1.gcd(bigInt2);
		boolean isPrime = bigInt1.isProbablePrime(10); // 10 is certainty level


		// add number 5 to java big integer
		// Initialize a BigInteger
		BigInteger bigInt = new BigInteger("123456789012345678901234567890");

		// Add 5 to the BigInteger
		BigInteger result = bigInt.add(BigInteger.valueOf(5));

		// Print the result
		System.out.println("Original BigInteger: " + bigInt);
		System.out.println("After adding 5: " + result);


	}
}
